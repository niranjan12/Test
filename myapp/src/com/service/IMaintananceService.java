package com.service;

import java.sql.SQLException;
import java.util.List;

import com.model.Expense;
import com.model.Income;
import com.model.Outstandings;

public interface IMaintananceService {
	
	public void saveIncome(Income maintain);
	public void saveExpense(Expense expense);
	public void saveOutstandings(Outstandings outstandings);
	
	public void clearSChemas();
	
	public long getTotalExpense() throws ClassNotFoundException, SQLException;
	public long getTotalIncome();
	
	
	//LogicalOperations
	public long getTotalOutstandings();
	public List getTotalOutStandings();
	public List getTotalEarnings();
	public List getTotalExpenses();
	public void timeRequiredToCloseAllOutStandings();
	public void timeRequiredToGatherDesiredAmountOfMoney();
	public void calculateRiskOnInvestiment(long amountofmoneytoinvest);
	
	
	//Business Logic
	
	
	

}
