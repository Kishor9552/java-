package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class InsertStatement {

	public static void main(String[] args) throws Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println(3);
		java.sql.Statement statement=connection.createStatement();
		System.out.println(4);
		String sql="insert into   test  student s values('1','sunny')";
		System.out.println(5);
		
         int x = statement.executeUpdate(sql);
         System.out.println(6);
         System.out.println(x); 
	
		
		
		
	}}
	
	