package com.logs;

import org.apache.log4j.Logger;

//import java.util.logging.Logger;

public class MyLogger {
	Logger log;
	public void logTest(){
		log=LogFactroy.getLogger(MyLogger.class.getName());
		log.info("MyLogger is started");
		log.info("Entering in to method logTest()");
		System.out.println("Executing method functionalities");
		//log.warning("Coming out of method logTest()");
		log.trace("Trace Message!");
	    log.debug("Debug Message!");
	    log.info("Info Message!");
	    log.warn("Warn Message!");
	    log.error("Error Message!");
	    log.fatal("Fatal Message!");
	}

}
