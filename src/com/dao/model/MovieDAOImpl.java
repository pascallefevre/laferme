package com.dao.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.utils.Closer;
import com.dao.utils.Context;
import com.sql.model.Person;

public class MovieDAOImpl implements MovieDAO
{
	@Override
	public List<Person> findAll() 
	{
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Person> fliste= new ArrayList<Person>();
		Connection conn;
		try 
		{
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT * FROM ? ");
			stmt.setString(1, "film");
			rs = stmt.executeQuery();

			while (rs.next() == true)
			{ 
				fliste.add(new Person(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getInt(9)));
			}
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
			System.out.println("SQLException: " + ex.getMessage());
		}
		finally 
		{
			Closer.closeResultSet(rs);
			Closer.closeStatement(stmt);
		}
		return fliste;
	}

	@Override
	public Person findByKey(Integer id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Person obj) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Person obj) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByKey(Integer id) 
	{
		// TODO Auto-generated method stub

	}





}
