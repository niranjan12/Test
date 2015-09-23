package com.test;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class AppTest {
	public static void main(String args[]){
		
		//Connection Test
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		System.out.println(session);
		
	}

}
