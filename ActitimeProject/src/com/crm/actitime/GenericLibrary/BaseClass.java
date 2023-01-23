
//16/01/2023

package com.crm.actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chore.driver", "./driver/chromedriver.exe");
	}
	ReadDataFromPropertyfile r= new ReadDataFromPropertyfile();
	public static WebDriver driver;
	
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database is connectd",true);
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database disconnected", true);
		
	}
	@BeforeTest
	public void launchBrowser() throws IOException {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		String url=r.readdatafromproperty("url");
		driver.get(url);
	}
	@AfterTest
	public void closeBrowser() {
	driver.close();

}
	@BeforeMethod
	public void login() throws IOException {
		String UN = r.readdatafromproperty("username");
		String	PW=	r.readdatafromproperty("password");

		LoginPage lp=new LoginPage(driver);
		lp.loginToActitime(UN, PW);
		
	
	}
	@AfterMethod
	public void logout() {
	 driver.findElement(By.id("logoutLink")).click();
	}
}
