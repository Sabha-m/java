package com.org.reuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base1 {

	public static WebDriver driver;
	public static WebDriver getdriver(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			ChromeOptions c = new ChromeOptions();
			c.addArguments("--remote-allow-origins=*");
			c.addArguments("--disable-notifications");
			driver = new ChromeDriver(c);	
		}
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			driver = new FirefoxDriver();	
		}
		else if(browser.equals("safari")) {
			
			System.setProperty("webdriver.safari.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	        driver = new SafariDriver();
		}
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}
	public void getClass(String string) {
		
		
	}
}
