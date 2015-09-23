package com.logs;

import org.apache.log4j.Logger;

//import java.util.logging.Logger;


public class LogFactroy {
	static Logger log;
	public static Logger getLogger(String className){
		return Logger.getLogger(className);
	}

}
