package de.dc.spring.data.model.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Gruppe{
	
	@Column()
	private long id;
	
	@Column(columnDefinition="", insertable=true, length=255, name="", nullable=true, precision=0, scale=0, table="", unique=true, updatable=true)
	private String name;
	
	@Column()
	private String vorname;
	
	public Gruppe() {
	}
	public Gruppe(long id, String name, String vorname) {
		this.id = id;
		this.name = name;
		this.vorname = vorname;
	}
	public long getId() {
		return id;
	}
			
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
			
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
			
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
}
