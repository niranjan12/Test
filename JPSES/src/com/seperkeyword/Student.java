package com.seperkeyword;

public class Student extends Person{
	public void showMessage(){
		System.out.println("Student class showMessage() called..!!!");
	}
	void display(){
		showMessage();
		super.showMessage();
	}

}
