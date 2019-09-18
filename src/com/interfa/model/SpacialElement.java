package com.interfa.model;

public abstract class SpacialElement extends Map
{
	private String affCode;
	private String name;
	protected int x;
	protected int y;
	protected boolean inAir;
	
	
	
	
	public SpacialElement( String affCode, String name, int x, int y, boolean inAir) {
		super(y, y);
		this.name = name;
		this.x = x;
		this.y = y;
		this.inAir = inAir;
		this.affCode = affCode;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAffCode() {
		return affCode;
	}
	public void setAffCode(String affCode) {
		this.affCode = affCode;
	}
	
	
	
}
