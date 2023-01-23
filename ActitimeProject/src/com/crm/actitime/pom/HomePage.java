//17/01/2023

package com.crm.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklink;
	
	@FindBy(xpath= "//div[.='Reports']")
	private WebElement repotslink;
	
	@FindBy(xpath= "//div[.='Users']")
	private WebElement Userslink;
	
	@FindBy(xpath= "//div[.='logoutLink']")
	private WebElement logoutlink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getTasklink() {
		return tasklink;
	}
	
	public WebElement getReportslink() {
		return repotslink;
		
	}
	
	public WebElement getUserslink() {
		return Userslink;
		
	}
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	//bussiness logic
	public void clickOntaskab() {
		tasklink.click();
	}
	
	
	
	
	
	

}
