package com.interfa.model;

public abstract class Being extends SpacialElement implements Movable
{
	
	protected int maxSpeed = 1;
	
	
	
	
	
	
	public Being(String affCode, String name, int x, int y, boolean inAir) {
		super(affCode, name, x, y, inAir);
		// TODO Auto-generated constructor stub
	}



	@Override
	public boolean goDown()
	{
		if (map[this.x][this.y-1] == null) 
		{
		int scloneX= this.x ;
		int scloneY= this.y;
		map[this.x][this.y-1]= this;
		map[scloneX][scloneY]=null;
		runMap();
		return true;
		}
		else return false;
	}
	@Override
	public boolean goRight() {
		if (map[this.x][this.y-1] == null) 
		{
		int scloneX= this.x ;
		int scloneY= this.y;
		map[this.x+1][this.y]= this;
		map[scloneX][scloneY]=null;
		runMap();
		return true;
		}
		else return false;
	}
	@Override
	public boolean goLeft() {
		if (map[this.x][this.y-1] == null) 
		{
		int scloneX= this.x ;
		int scloneY= this.y;
		map[this.x-1][this.y]= this;
		map[scloneX][scloneY]=null;
		runMap();
		return true;
		}
		else return false;
	}
	@Override
	public boolean goUp() {
		if (map[this.x][this.y-1] == null) 
		{
		int scloneX= this.x ;
		int scloneY= this.y;
		map[this.x][this.y+1]= this;
		map[scloneX][scloneY]=null;
		runMap();
		return true;
		}
		else return false;
	}
}
