package com.SalesFroce.TestFile;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SalesForce.Pages.AccountsPage;
import com.SalesForce.Utilities.Utilities;

public class AccountsTest extends Utilities {
	
	@BeforeMethod
	public void start() throws IOException {
		openBrowser("chrome", "https://login.salesforce.com/");
		salesForceLogin();
	}

	@Test
	public void creatAccount() throws IOException, InterruptedException {
		
		AccountsPage account = new AccountsPage();
	    
		account.clickAccountTab(); 
		account.clickNewButton();
		account.enterAccName();
		account.enterParentAcc();
		account.enterAccountNumber();
		account.enterAccSite();
		account.selectType("Technology Partner");
		account.selectIndustry("Finance");
		account.enterAnnualRevenur();
		account.selectRating("Hot");
		account.enterWebSite();
		account.enterSymbol();
		account.enterEmployees();
		account.selectOwnerShip("Public");
		
		
		account.clickSave();
		
		
	}
	
	@AfterMethod
	public void finish() {
		tearDown();
	}
	
	
	
	

}
