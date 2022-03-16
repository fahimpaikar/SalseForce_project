package com.SalesFroce.TestFile;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SalesForce.Pages.LeadPage;
import com.SalesForce.Utilities.Utilities;

public class LeadTest extends Utilities {
	
	
	@BeforeMethod
	public void start() throws IOException {
		openBrowser("chrome","https://login.salesforce.com/");
		salesForceLogin();
	}
	
	
	@Test
	public void createLead() {
		LeadPage lead = new LeadPage();
		lead.clickLeadTab();
		lead.clickNewButton();
		lead.EnterName("Fahim");
		lead.EnterLastName("Paikar");
		lead.EnterCompany("CodeGator");
		lead.ClickSave();
	}
	
	
	@AfterMethod
	public void finish() {
		tearDown();
	}
	
	
	
	
	
	

}
