package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tutorials")
public class Tutorial {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	@Column(name="published")
	private boolean isPublished;
	
	public Tutorial() {
		
	}
	
	public Tutorial(String title, String description, boolean isPublished) {
		super();

		this.title = title;
		this.description = description;
		this.isPublished = isPublished;
	}
	


	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public boolean isPublished() {
		return isPublished;
	}
	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}
	
	
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", isPublished="
				+ isPublished + "]";
	}
	

}
