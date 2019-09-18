package com.interfa.model;

public abstract class Animal extends Being
{
	

	
	public Animal(String affCode, String name, int x, int y, boolean inAir) {
		super(affCode, name, x, y, inAir);
	}



	private Human h;
	
	
	
	


	public abstract String communicate();


	public Human getH() {
		return h;
	}


	public void setH(Human h) {
		this.h = h;
	}
	
	
}
