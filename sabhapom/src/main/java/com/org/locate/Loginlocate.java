	package com.org.locate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.reuse.Base;

public class Loginlocate extends Base {
	@FindBy(id = "email")
	private WebElement textuname;
	@FindBy(name = "pass")
	private WebElement textpassword;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement clkloginbtn;         
	
	
	public WebElement getTextuname() {
		return textuname;
	}
	public void setTextuname(String textuname) {
		this.textuname.sendKeys(textuname);
	}
	public WebElement getTextpassword() {
		return textpassword;
	}
	public void setTextpassword(String textpassword) {
		this.textpassword.sendKeys(textpassword);
	}
	public WebElement getClkloginbtn() {
		return clkloginbtn;
	}
	public void setClkloginbtn(WebElement clkloginbtn) {
		this.clkloginbtn = clkloginbtn;
	}
	public Loginlocate() {
		PageFactory.initElements(driver, this);
	}

}
