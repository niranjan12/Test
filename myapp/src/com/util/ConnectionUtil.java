package com.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {
	static Session session=null;
	static java.sql.Connection con=null;
	
	public static Session getHibernateSession(){
		session=new Configuration().configure().buildSessionFactory().openSession();
		return session;
	}
	
	public static java.sql.Connection getJDBCConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/maintanance","root","tiger");
		return con;
		
	}

}
