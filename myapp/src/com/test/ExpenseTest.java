package com.test;

import com.model.Expense;
import com.service.MaintananceService;

public class ExpenseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaintananceService service=new MaintananceService();
		Expense exp=new Expense();
		exp.setExpensdate("7/9/2015");
		exp.setExpense(600);
		exp.setReason("Home_search");
		service.saveExpense(exp);
		System.out.println("Record Stored Sucessfully");

	}

}
