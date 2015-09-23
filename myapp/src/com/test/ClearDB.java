package com.test;

import com.service.MaintananceService;

public class ClearDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaintananceService service=new MaintananceService();
		service.clearSChemas();
		
		

	}

}
