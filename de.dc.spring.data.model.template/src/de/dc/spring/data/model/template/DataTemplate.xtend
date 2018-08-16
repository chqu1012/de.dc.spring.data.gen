package de.dc.spring.data.model.template

import de.dc.spring.data.model.spdat.Column
import de.dc.spring.data.model.spdat.Data
import de.dc.spring.data.model.spdat.SpringProject

class DataTemplate implements IGenerator<Data>{
	
	override gen(Data data)'''
	«val project = (data.eContainer as SpringProject)»
	package «project.packagePath».«data.path»;
	
	import java.time.LocalDateTime;
	
	import javax.persistence.*;
	
	@Entity
	public class «data.name.toFirstUpper»{
		
		«FOR property : data.properties»
			«IF property.isId»
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name = "«property.name.toUpperCase»_ID", nullable = false, columnDefinition = "BIGINT")
			private Long id;
			«ELSE»
			@Column(«property.column.columnParameters»)
			private «property.type» «property.name.toFirstLower»;
			«ENDIF»
		«ENDFOR»
		
		public «data.name.toFirstUpper»() {
		}
		«val parameter = data.properties.map[it.type+' '+it.name.toFirstLower].reduce[p1, p2|p1+', '+p2]»
		public «data.name.toFirstUpper»(«parameter») {
			«FOR property : data.properties»
			this.«property.name.toFirstLower» = «property.name.toFirstLower»;
			«ENDFOR»
		}
		«FOR property : data.properties»
		public «property.type» get«property.name.toFirstUpper»() {
			return «property.name.toFirstLower»;
		}
				
		public void set«property.name.toFirstUpper»(«property.type» «property.name.toFirstLower») {
			this.«property.name.toFirstLower» = «property.name.toFirstLower»;
		}
		«ENDFOR»
	}
	'''
	
	def String getColumnParameters(Column column){
		if (column===null) {
			return ""
		}	
		return '''columnDefinition="«column.columnDefinition»", insertable=«column.isInsertable», length=«column.length», «column.name»", nullable=«column.nullable», precision=«column.precision», scale=«column.scale», table="«column.name»", unique=«column.isUnique», updatable=«column.isUpdatable»'''
	}
}