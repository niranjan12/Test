package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection connection = null;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","nira","niranjan");
		System.out.println("Connected...!!!");
		Statement st=connection.createStatement();
		String query="CREATE TABLE COMPANY1("+
				   "ID INT PRIMARY KEY     NOT NULL,"+
				   "NAME           TEXT    NOT NULL,"+
				   "AGE            INT     NOT NULL,"+
				   "ADDRESS        CHAR(50),"+
				  " SALARY         REAL"+
				");";
					
		st.executeUpdate(query);
		System.out.println("Table created...!!!");
		String query1="DROP table company1 ;";
		
		st.executeUpdate(query1);
		System.out.println("Table dropped...");
		connection.close();

	}

}
