package com.codingdojo.crud.models;

import javax.validation.constraints.Size;
import javax.persistence.*;

@Entity
public class Language {
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Size(min =2, max =20)
	private String name;
	@Size(min =2, max=20)
	private String creator;
	@Size(min =1, max =10)
	private String currentVersion;
	@Id
	@GeneratedValue
	private long id;
	
	public Language(){
	}
	
	public Language(String name, String creator, String version) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
}
	