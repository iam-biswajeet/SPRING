package com.nt.test;

import org.apache.log4j.Logger;

public class LoggingTest {
	private static Logger log=Logger.getLogger(LoggingTest.class);
	public static void main(String[] args) {
		log.debug("success message");
		log.info("current status");
		log.warn("warning message");
		log.error("exception message");
		log.fatal("serious problem");
		
	}
}
