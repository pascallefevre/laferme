package com.interfa.model;

public class Eagle extends Animal implements Flying
{
	

	
	
	

	

	
	public Eagle(String affCode, String name, int x, int y, boolean inAir) {
		super(affCode, name, x, y, inAir);
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean flying() {

		if(inAir == false) 
		{
			inAir=true; 
			return true;
		}
		else
		{
			inAir=false; 	
			return false;
		}
	}

	@Override
	public String communicate() 
	{
		String text="Aiiiiiiiiiiiiii�e";
		return text;
	}


}
