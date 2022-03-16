package com.SalesFroce.TestFile;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.SalesForce.Pages.AccountsPage;
import com.SalesForce.Utilities.Utilities;

public class AccountsTest2 extends Utilities {

	@BeforeMethod
	public void start () throws IOException {
		openBrowser("chrome", "https://login.salesforce.com/");
		salesForceLogin();
	}

	@Test(dataProvider = "listOFCredentials")
	public void creatAccount() throws IOException {
		AccountsPage account = new AccountsPage();
		account.clickAccountTab();
		account.clickNewButton();
		account.enterAccName();
		account.enterParentAcc();
		account.enterAccSite();
		account.selectType("Technology Partner");
		account.selectIndustry("Finance");
		account.enterAnnualRevenur();
		account.selectRating("Warm");
		account.enterSymbol();
		account.enterEmployees();
		account.selectOwnerShip("Public");

		account.clickSave();

	}
	
	@DataProvider
	public Object[][] listOFCredentials() throws IOException {
		Object[][] credentials = readData("C:\\Users\\fahim\\eclipse-workspace\\Com.POMwithPageFactory\\TestData.xlsx", "accounts");
		return credentials;
		
	}

	@AfterMethod
	public void finish() {
		tearDown();
	}

}
