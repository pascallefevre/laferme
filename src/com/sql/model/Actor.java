package com.sql.model;

public class Actor 
{
	private int id;
	private String firstname;
	private String lastname;
	
	
	
	
	
	public Actor(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}





	public int getId() {
		return id;
	}





	public String getFirstname() {
		return firstname;
	}





	public String getLastname() {
		return lastname;
	}





	public void setId(int id) {
		this.id = id;
	}





	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}





	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	
	
	
}
