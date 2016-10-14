package com.naga.demos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPoolingDemo
{

	public void connectionMethod()
	{
		try
		{
			String sql = "SELECT * FROM AD9MM.CUST WHERE CUST_ID  =1 WITH UR";
			
			Context context = new InitialContext();
			Context envContext  = (Context) context.lookup("java:/comp/env");
			DataSource dataSource = (DataSource)envContext.lookup("jdbc/PR6");
			
			Connection connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(sql) ;
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Customer ID IS... "+rs.getInt("CUST_ID"));
			}
			
			
		} 
		catch (NamingException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			
		}
		
	}
}
