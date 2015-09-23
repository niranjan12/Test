package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Expense;
import com.model.Income;
import com.model.Outstandings;
import com.mysql.jdbc.Statement;
import com.util.ConnectionUtil;

public class MaintananceService implements IMaintananceService{
	
	Session session;
	Transaction txn;

	public void saveIncome(Income i) {
		session=ConnectionUtil.getHibernateSession();
		txn=session.beginTransaction();
		session.save(i);
		txn.commit();
		session.close();
		
	}

	public void saveExpense(Expense expense) {
		session=ConnectionUtil.getHibernateSession();
		txn=session.beginTransaction();
		session.save(expense);
		txn.commit();
		session.close();
		
	}

	public void saveOutstandings(Outstandings outstandings) {
		session=ConnectionUtil.getHibernateSession();
		txn=session.beginTransaction();
		session.save(outstandings);
		txn.commit();
		session.close();
		
	}

	public void clearSChemas() {
		session=ConnectionUtil.getHibernateSession();
		txn=session.beginTransaction();
		System.out.println("Deleting data from INcome table");
		Query query1=session.createQuery("delete from Income");
		System.out.println("Deleting data from expense table");
		Query query2=session.createQuery("delete from Expense");
		System.out.println("Deleting data from outstanding table");
		Query query3=session.createQuery("delete from Outstandings");
		query1.executeUpdate();
		query2.executeUpdate();
		query3.executeUpdate();
		txn.commit();
		session.close();
		System.out.println("All datas are cleaned...");
		
	}
	
	
	
	
	//DML operations

	public long getTotalExpense() throws ClassNotFoundException, SQLException {
		System.out.println("executing getTotalExpense...");
		long value=0;
		/*session=ConnectionUtil.getHibernateSession();
		SQLQuery query=session.createSQLQuery("select sum(osamount) from outstandings");
		*/
		Connection con=ConnectionUtil.getJDBCConnection();
		System.out.println("con is :  "+con);
		java.sql.Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select sum(expense) from expense;");
		while(rs.next()){
			value=rs.getLong(1);
			System.out.println("Method executed...");
		}
		return value;
	}

	public long getTotalIncome() {
		
		return 0;
	}

	public long getTotalOutstandings() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void timeRequiredToCloseAllOutStandings() {
		// TODO Auto-generated method stub
		
	}

	public void timeRequiredToGatherDesiredAmountOfMoney() {
		// TODO Auto-generated method stub
		
	}

	public void calculateRiskOnInvestiment(long amountofmoneytoinvest) {
		// TODO Auto-generated method stub
		
	}

	public List getTotalOutStandings() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getTotalEarnings() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getTotalExpenses() {
		// TODO Auto-generated method stub
		return null;
	}

}
