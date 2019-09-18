package com.interfa.model;

import java.util.ArrayList;
import java.util.List;

public class Map 
{
	private int dimX;
	private int dimY;
	public SpacialElement[][] map;
	
	
	public Map(int dimX, int dimY) {
		super();
		this.dimX = dimX;
		this.dimY = dimY;
		this.map = new SpacialElement[dimX][dimY];
	}

	public SpacialElement getElem(int x, int y)
	{
		return this.map[x][y];
	}
	
	public void addMapListElem(ArrayList<SpacialElement> elist)
	{
		for ( int i =0; i<elist.size(); i++)
		{
		  	
			map [elist.get(i).x] [elist.get(i).y] = elist.get(i);
			
		}
	}
	public  void rmAllMapListElem(ArrayList<SpacialElement> elist)
	{
		for ( int i =0; i<elist.size(); i++)
		{
		  	
			map [elist.get(i).x] [elist.get(i).y] = null;
			
		}
	}
	
	public void addMapElem(SpacialElement s)
	{
		map[s.x][s.y]=s;
	}
	
	public  void rmMapElem(SpacialElement s)
	{
		map[s.x][s.y]=null;
	}


//	public  void runMap()
//	{
//		
//	
//		for (int j=0; j<this.dimY; j++)
//		{
//			
//			System.out.print("\n");
//			for (int i=0; i<this.dimX; i++)
//			{
//				if(this.getElem(i,j) != null)
//				System.out.print( this.getElem(i, j).getAffCode() );
//				else System.out.print(" ");
//			}
//		}
//	}
	

	public  void runMap()
	{
		
	
		for (int j=dimY-1; j>0; j--)
		{
			
			System.out.print("\n");
			for (int i=0; i<this.dimX; i++)
			{
				if(this.getElem(i,j) != null)
				System.out.print( this.getElem(i, j).getAffCode() );
				else System.out.print(" ");
			}
		}
	}
	

	

	
	
	
	
}
