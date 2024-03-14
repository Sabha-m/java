package com.org.locate;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.reuse.Base1;

public class Locaters extends Base1{

	@FindBy (xpath = "//div[@class='sc-VigVT ishpWr']/div[1]/div[1]/div[1][@class='sc-htoDjs kyqvCq']")
	private WebElement from;
	@FindBy(id = "//input[@id='dest']")
	private WebElement to;
	
	@FindBy(className = "labelCalendarContainer")
	private WebElement date;
	
	public WebElement getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from.click();
		
	}

	public WebElement getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to.sendKeys(to);
	}

	public WebElement getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date.sendKeys(date);
	}
    
	public Locaters() {
		
		PageFactory.initElements(driver, this);
	}

	
	
	
}
