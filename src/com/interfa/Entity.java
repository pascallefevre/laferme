package com.interfa;

import com.interfa.model.Human;

import java.util.ArrayList;
import java.util.List;

import com.interfa.model.Chicken;
import com.interfa.model.Dog;
import com.interfa.model.Eagle;
import com.interfa.model.Ematerial;
import com.interfa.model.Tree;
import com.interfa.model.Rock;
import com.interfa.model.SpacialElement;
import com.interfa.model.House;
import com.interfa.model.MobileHome;
import com.interfa.model.Map;


public class Entity {

	public static void main(String[] args)
	{
		test1();
		
		

	}
	public static void test1() 
	{

		

		Human p1 = new Human("P","Jordan",4,3, false, 999999999);
		Chicken c1= new Chicken("k","Barbu de Thuringe", 5, 5, false);
		Eagle e1 = new Eagle("a","Pygargue à queue blanche", 6, 6, true);
		Dog d1= new Dog("d","Berger Kangal", 6, 3, false);


		House h1 = new 	House("H","Chikenhouse", 4, 5, false, 10000, null, Ematerial.BRICK);
		House h2 = new House("H","LaMaisonB", 2, 3, false, 11200, null, Ematerial.WOOD);
		House h3 = new House("H","LaMaisonC", 2, 2, false, 11200, null, Ematerial.WOOD);
		House h4 = new House("H","LaMaisonD", 2, 1, false, 11200, null, Ematerial.WOOD);
		Tree t1 = new Tree("T","Big Oak", 3, 5, false);
		Tree t2 = new Tree("T","little Oak",7,6, false);
		Rock r1 = new Rock("R","Rock of the village", 2, 5, false);
		Rock r2 = new Rock("R","Rock of the village", 1, 5, false);
		Rock r3 = new Rock("R","Rock of the village", 1, 4, false);
		
		
	    
		
		ArrayList<SpacialElement> elist = new ArrayList<SpacialElement>();

			elist.add(p1);
			elist.add(c1);
			elist.add(e1);
			elist.add(d1);
			elist.add(h1);
			elist.add(h2);
			elist.add(h3);
			elist.add(h4);
			elist.add(t1);
			elist.add(t2);
			elist.add(r1);
			elist.add(r2);
			elist.add(r3);
		Map map = new Map(10, 10);
		map.addMapListElem(elist);	
		map.runMap();
		p1.goUp();
	
	
	}	
	

}
