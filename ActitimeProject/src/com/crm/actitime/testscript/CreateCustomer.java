//16/1/2023

package com.crm.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.actitime.GenericLibrary.BaseClass;
import com.crm.actitime.GenericLibrary.ListenerImplimantion;
import com.crm.actitime.pom.HomePage;
@Listeners(ListenerImplimantion.class)
public class CreateCustomer extends BaseClass {
	@Test
	public void createCustomer() {
	HomePage hp=new HomePage(driver);
	hp.clickOntaskab();
	
	}

}
