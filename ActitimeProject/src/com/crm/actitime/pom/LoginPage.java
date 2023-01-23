//17/01/2023


package com.crm.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.actitime.GenericLibrary.ReadDataFromPropertyfile;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy (name = "pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgnbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public void setUntbx(WebElement untbx) {
		this.untbx = untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public void setPwtbx(WebElement pwtbx) {
		this.pwtbx = pwtbx;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}

	public void setLgnbtn(WebElement lgnbtn) {
		this.lgnbtn = lgnbtn;
	}
	//Business logic
	public void loginToActitime(String UN,String PW)  {
		
		untbx.sendKeys(UN);
		pwtbx.sendKeys(PW);
		lgnbtn.click();
	}
	
}
