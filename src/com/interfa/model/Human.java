package com.interfa.model;

import java.util.List;

public class Human extends Being implements Adopter, Buyer
{
	private int money;
	private List<House> myHouses;
	private List<Animal> myAnimals;

	
	
	
	
	

	public Human(String affCode, String name, int x, int y, boolean inAir, int money) {
		super(affCode, name, x, y, inAir);
		this.money = money;
	}



	@Override
	public boolean buy(House h) 
	{
		if(money>=h.getPrice()) 
		{
			myHouses.add(h);
			h.setOwner(this);
			return true;
		}
		else return false;
	}
		
	@Override
	public void sell(House h) 
	{
		if(myHouses.contains(h)) 
		{
			myHouses.remove(h);
			h.setOwner(null);
			money+=h.getPrice();
		}
	}

	@Override
	public boolean adopte(Animal a) 
	{
		if(myAnimals.contains(a)) 
		{
			myAnimals.add(a);
			a.setH(this);
			return true;
		}
		else return false;
	}

	@Override
	public boolean revoke(Animal a) 
	{
		if(myAnimals.contains(a)) 
		{
			myAnimals.remove(a);
			a.setH(null);
			return true;
		}
		else return false;
	}

	public int getMoney() {
		return money;
	}

	public List<House> getMyHouses() {
		return myHouses;
	}

	public List<Animal> getMyAnimals() {
		return myAnimals;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setMyHouses(List<House> myHouses) {
		this.myHouses = myHouses;
	}

	public void setMyAnimals(List<Animal> myAnimals) {
		this.myAnimals = myAnimals;
	}


	
}
