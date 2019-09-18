package com.interfa.model;

public class House extends SpacialElement  
{
	private int price;
	private Human owner;
	 Ematerial housetype;
	 
	 

	





	public House(String affCode, String name, int x, int y, boolean inAir, int price, Human owner,
			Ematerial housetype) {
		super(affCode, name, x, y, inAir);
		this.price = price;
		this.owner = owner;
		this.housetype = housetype;
	}



	



	public int getPrice() {
		return price;
	}



	public Human getOwner() {
		return owner;
	}



	public void setOwner(Human owner) {
		this.owner = owner;
	}
	
	 
	 
	
}
