package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;

public class DBConnect {

	private static Connection conn;

	
	  public static Connection getConn() {
	 try {
	  Class.forName("com.mysql.cj.jdbc.Driver"); 
	  conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/Cdac_Project","root","Sahilt6@");
	 
		} catch (Exception e) {
			e.printStackTrace();
		}
	return conn;

	}

}/*
public class DBConnect {

	PreparedStatement ps;
	private static Connection conn;

	public static Connection getConn() {
		try {
			
//step1 right click on project --> build path--> configure build path--> classpath--> add External jar -->select mysql-connector jar
//step2 right click on project --> build path--> configure build path--> deployment assembly--> add --> java build path entries -->  select mysql-connector jar
						
			Class.forName("com.mysql.cj.jdbc.Driver");
	        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_project","root","Sahilt6@");
		}catch(Exception w) {}
		
	}
	public PreparedStatement getStatement(String sql) throws Exception 
	{
	 return conn.prepareStatement(sql);	
	}
	return conn;
}
*/