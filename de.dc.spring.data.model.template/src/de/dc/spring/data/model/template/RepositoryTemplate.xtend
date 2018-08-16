package de.dc.spring.data.model.template

import de.dc.spring.data.model.spdat.Repository
import de.dc.spring.data.model.spdat.SpringProject

class RepositoryTemplate implements IGenerator<Repository>{
	
	override gen(Repository data)'''
	«val project = (data.eContainer as SpringProject)»
	package «project.packagePath».«data.path»;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	import «project.packagePath».«data.associatedData.path».*;
	
	@Repository
	public class «data.name.toFirstUpper»Repository extends JpaRepository<«data.associatedData.name», Long>{
	}
	'''
	
}