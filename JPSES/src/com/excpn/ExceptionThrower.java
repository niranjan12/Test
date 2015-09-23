package com.excpn;

public class ExceptionThrower {
	
	public void throwNull(){
		throw new NullPointerException("Null Exception Reached..");
		
	}
	
	public void throwArrayIndexOutOfBound(){
		System.out.println("ArrayIndex outof bound thrown..");
		throw new ArrayIndexOutOfBoundsException("Array Exception Reached..");
		
		
	}
	
	public void throwLangException() throws Exception{
		System.out.println("Lang Exception about to  thrown..");
		Thread.sleep(3000);
		throw new java.lang.Exception("Lang Exception...");
	}

}
