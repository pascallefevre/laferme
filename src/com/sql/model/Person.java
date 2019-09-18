package com.sql.model;

public class Person 
{
	private int id;
	private String title;
	private String description;
	private int release_year;
	private int length;
	public Person(int id, String title, String description, int release_year, int length) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
		this.length = length;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public int getRelease_year() {
		return release_year;
	}
	public int getLength() {
		return length;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
}
