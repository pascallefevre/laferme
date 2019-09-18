package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sql.model.Actor;

public class Entity 
{

	public static void main(String[] args) 
	{  
	    PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Actor> aliste= new ArrayList<Actor>();
		try 
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila?" +
					"user=root&password=root&serverTimezone=UTC");
		
			stmt = conn.prepareStatement("UPDATE actor SET first_name=? WHERE actor_id= ? ");
			stmt.setInt(2, 6);
			stmt.setString(1, "BETTE");
			stmt.executeUpdate();
			
			
			
			stmt = conn.prepareStatement("SELECT * FROM actor WHERE first_name LIKE ? AND last_name LIKE ? ");
			stmt.setString(1, "%TT%");
			stmt.setString(2, "%CHOL%");
		    rs = stmt.executeQuery();
		    
		    
		   
		    while (rs.next() == true)
		    { 
		    	aliste.add(new Actor(rs.getInt(1), rs.getString(2), rs.getString(3)));
		    	
		    }
		    
		    for(Actor elem : aliste)
		    {
		    	System.out.println(elem.getFirstname()+"  "+ elem.getLastname());
		    }
		
		} 

		catch (Exception ex) 
		{
			ex.printStackTrace();
			System.out.println("SQLException: " + ex.getMessage());
		}
		finally {
		    // it is a good idea to release
		    // resources in a finally{} block
		    // in reverse-order of their creation
		    // if they are no-longer needed

		    if (rs != null) 
		    {
		        try 
		        {
		            rs.close();
		        } catch (SQLException sqlEx) { } // ignore

		        rs = null;
		    }

		    if (stmt != null)
		    {
		        try 
		        {
		            stmt.close();
		        } catch (SQLException sqlEx) { } // ignore

		        stmt = null;
		    }
	}

	}
}
	
	
	
	
	
	

