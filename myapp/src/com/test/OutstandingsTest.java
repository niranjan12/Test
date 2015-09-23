package com.test;

import com.model.Outstandings;
import com.service.MaintananceService;

public class OutstandingsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaintananceService service=new MaintananceService();
		Outstandings outstandings=new Outstandings();
		outstandings.setOsamount(3500);
		outstandings.setOutstandings("3/09/2015");
		outstandings.setReason("Rajeev");
		service.saveOutstandings(outstandings);
		System.out.println("Record Stored Sucessfully...");
		
		
		//Check outstandings..

	}

}
