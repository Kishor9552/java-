package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StatementTest {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println(3);
		java.sql.Statement statement=connection.createStatement();
		System.out.println(4);
		String sql="SELECT * FROM student s";
		System.out.println(5);
		ResultSet resultset=statement.executeQuery(sql);
		System.out.println(6);
		while(resultset.next()) {
			String stuName=resultset.getString(1);
			System.out.println("stuName >>"+stuName);
       	 String idStudent= resultset.getString(2);
       	 System.out.println("idStudent >>"+idStudent);
		}}}
	
	