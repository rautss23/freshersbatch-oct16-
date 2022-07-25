package com.example.model;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="tutorials")
public class Tutorial {
	@Id
	private String id;
	private String title;
	private String description;
	private boolean isPublished;
	
	public Tutorial() {
		super();
	}
	public Tutorial(String title, String description, boolean isPublished) {
		super();
		this.title = title;
		this.description = description;
		this.isPublished = isPublished;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isisPublished() {
		return isPublished;
	}
	public void setisPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}
	
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", isPublished="
				+ isPublished + "]";
	}
	
	
	
}
