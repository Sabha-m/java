package com.org.logic;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.org.locate.Loginlocate;
import com.org.reuse.Base;

public class Loginlogic extends Base {
	static Base be;
	Loginlocate lo;

	@BeforeClass
	public static void browsecall() {
		be.getdriver("chrome");
	}

	@Test
	public void logic() {
		lo = new Loginlocate();
		lo.setTextuname("sabha1998@gmail.com");
		lo.setTextpassword("******");
		lo.getClkloginbtn().click();
	}
	@AfterClass
	public static void close() {
		
		driver.close(); 
		
	}

}
