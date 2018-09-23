package com.sample1.noparameter;

import org.junit.Test;

public class MessageUtilTest {

	String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @Test(expected = ArithmeticException.class)
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");     
	      messageUtil.printMessage();     
	   }
}
