package com.model;

public class Expense {
	private int id;
	private String expensdate;
	private String reason;
	private long expense;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExpensdate() {
		return expensdate;
	}
	public void setExpensdate(String expensdate) {
		this.expensdate = expensdate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public long getExpense() {
		return expense;
	}
	public void setExpense(long expense) {
		this.expense = expense;
	}
	
	

}
