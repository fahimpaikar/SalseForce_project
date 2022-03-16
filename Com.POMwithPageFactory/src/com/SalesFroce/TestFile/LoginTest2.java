package com.SalesFroce.TestFile;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SalesForce.Pages.Dashboard;
import com.SalesForce.Pages.LoginPage;
import com.SalesForce.Utilities.Utilities;

public class LoginTest2 extends Utilities {

	@BeforeMethod
	public void start() {
		openBrowser("chrome", "https://login.salesforce.com/");
	}

	@Test
	public void usingValidCredentials() throws IOException {
		// the seperators are different in mac and windows we will file.sperator option
		// so that it will add it itself.
		// file.seperator will add the seperator based on the operating system in PC.
		initProperty(File.separator+"config"+File.separator+"credential.properties");
		LoginPage login = new LoginPage();
		login.EnterUsername(prop.getProperty("validUsername"));
		login.EnterPass(prop.getProperty("validPassword"));
		login.clickLogin();
		Dashboard dp = new Dashboard();
		dp.verifySetupLink();

	}

	@Test
	public void invalidCredentials() {
		LoginPage login = new LoginPage();
		login.EnterUsername("toorachee");
		login.EnterPass("ghalatas");
		login.clickLogin();

	}

	@AfterMethod
	public void stop() {
		tearDown();
	}

}
