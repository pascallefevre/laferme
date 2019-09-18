package com.interfa.model;

public class Dog extends Animal 
{
	
	
	
	

	
	
	public Dog(String affCode, String name, int x, int y, boolean inAir) {
		super(affCode, name, x, y, inAir);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String communicate() {
		String text="Woouuf";
		return text;
	}

}
