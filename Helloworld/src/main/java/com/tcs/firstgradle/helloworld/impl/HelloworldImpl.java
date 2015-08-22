package com.tcs.firstgradle.helloworld.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloworldImpl {
	Logger logger = Logger.getLogger(getClass().getName());
	public String sayHelloworld() {
		logger.log(Level.INFO, "Helloworld");
		return "Success";
	}

}
