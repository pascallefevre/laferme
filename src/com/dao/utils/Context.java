package com.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Context 
{
	private static Context instance = null;
	private Connection conn;
	
	private Context() 
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila?" +
					"user=root&password=root&serverTimezone=UTC");
			}
		catch (Exception ex) 
		{
			ex.printStackTrace();
			System.out.println("SQLException: " + ex.getMessage());
		}
		
		
	}

	public static Context getInstance() 
	{
		if(instance == null) {instance = new Context();}
		return instance;
	}

	public Connection getConn() {
		return conn;
	}

	

	
	
}
