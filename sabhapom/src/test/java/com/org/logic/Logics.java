package com.org.logic;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.org.locate.Locaters;

import com.org.reuse.Base1;

public class Logics extends Base1{

	static Base1 b;
	Locaters loc;
	
	@BeforeClass
	public static void browsecall() {
		b.getdriver("chrome");
		
	}
	
	@Test
	public void logic() throws InterruptedException {
		loc = new Locaters();
		Thread.sleep(5000);
		loc.get.click();
		loc.setFrom("chennai");
		Thread.sleep(5000);

		loc.getFrom().click();
		loc.setTo("Salem");
		
		loc.setDate("06.03.2024");
				
}
	//@AfterClass
	//public static void close() {
		
	//	driver.close(); 
	//}
}
	
