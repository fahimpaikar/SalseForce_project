package com.SalesFroce.TestFile;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SalesForce.Pages.LoginPage;
import com.SalesForce.Utilities.Utilities;

public class LoginTestUsingExcell extends Utilities {
	
	@BeforeMethod
	public void start() {
		openBrowser("chrome", "https://login.salesforce.com/");
	}

	
	
	
	@Test(dataProvider="listOFCredentials")
	public void usingValidCredentials(String username, String password) throws IOException {

	    LoginPage login = new LoginPage();
		login.EnterUsername(username);
		login.EnterPass(password);
		login.clickLogin();

	}
	
	
	
	
	@DataProvider
	public Object[][] listOFCredentials() throws IOException {
		Object[][] credentials = readData("C:\\Users\\fahim\\eclipse-workspace\\Com.POMwithPageFactory\\TestData.xlsx", "sheet1");
		return credentials;
		
	}
	
	
	

	@AfterMethod
	public void stop() {
		tearDown();
	}
	
	
	

}
