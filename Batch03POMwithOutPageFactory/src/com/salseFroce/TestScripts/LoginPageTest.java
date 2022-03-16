package com.salseFroce.TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.salseFroce.pages.LoginPage;
import com.salseFroce.utilities.Utilities;

public class LoginPageTest extends Utilities {

	@BeforeMethod
	public void start() {
		openBrowser("firefox", "https://login.salesforce.com/");
	}

	@Test
	public void usingValidCredentials() {

		LoginPage login = new LoginPage();
		login.enterUsername("batch03@codegator.us.qa");
		login.enterPassword("Pa55word");
		login.clickLogin();

	}

	@Parameters({"user","pass"})
	@Test
	public void usingInvalidCredentials(String user, String pass) {

		LoginPage login = new LoginPage();
		login.enterUsername(user);
		login.enterPassword(pass);
		login.clickLogin();

	}

	@AfterMethod
	public void finish() {
		tearDown();
	}

}
