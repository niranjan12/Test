package com.test;

import java.sql.SQLException;

import com.service.MaintananceService;

public class BusinessTest {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	/*This is a AI application to keep track on all my incomes, expenses and out standings
	  in order to monitor my financial activities in a proper way such that user take his/her financial 
	  decessions in a proper way.
	  It has three major components 
	  1.Income
	  2.Expense
	  3.Outstanding
	  
	  Gathering data from above three components application takes financial decessions
	  Major services and functionalities of this application are 
	  1.creating  reports on from monthly expenses data
	  2.Assisting over monthly expenses details.
	  3.Making decessions over expenses. 235265
	  4.Calculate period of overcoming outstanding and assisting how much user have to close every month..
	  5. Application is capable of generating excel reports.*/
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MaintananceService service=new MaintananceService();
		System.out.println(service.getTotalExpense());

	}

}
