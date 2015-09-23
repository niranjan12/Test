package com.excpn;

public class TestException {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ExceptionThrower et=new ExceptionThrower();
		try{
			//et.throwNull();
			et.throwArrayIndexOutOfBound();
			//et.throwLangException();
		}catch(NullPointerException e1){
			System.out.println("Null Pointer Exception");
			
		}catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("ArrrayIndex out of bound exception");
			
		}
		  
			  
			
		

	}

}
