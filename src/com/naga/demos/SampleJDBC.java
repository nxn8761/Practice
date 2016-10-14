package com.naga.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleJDBC
{

	public static void main(String[] args)
	{
		try
		{
			String sql ="SELECT * FROM AD9MM.CUST WHERE CUST_ID = ? WITH UR";
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection connection = DriverManager.getConnection("jdbc:db2://172.18.103.52:5122/NP1","nxn8761","qa16test");
			//Statement stmt = connection.createStatement();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, 1234);
			int x = stmt.executeUpdate();
			
			System.out.println(x);
			//boolean s = stmt.execute();
			//System.out.println(s);
			
		   /* System.out.println(rs.getMetaData().getColumnType(1));
			while(rs.next())
			{
				rs.deleteRow();
				System.out.println(rs.getInt("CUST_ID"));
			}*/
		}
		catch(ClassNotFoundException | SQLException c)
		{
			c.printStackTrace();
			System.out.println(c.getMessage());
		}
		

	}

}
