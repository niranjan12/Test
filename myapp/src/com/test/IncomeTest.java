package com.test;

import com.model.Income;
import com.service.MaintananceService;

public class IncomeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Income i=new Income();
		i.setIncomedate("07/09/2015");
		i.setInomeamount(30000);
		i.setSourse("sal");
		MaintananceService service=new MaintananceService();
		service.saveIncome(i);

	}

}
