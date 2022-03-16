package com.SalesFroce.TestFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SalesForce.Pages.LoginPage;
import com.SalesForce.Utilities.Utilities;

public class LoginTestOriginal extends Utilities {

	@BeforeMethod
	public void start() {
		openBrowser("chrome", "https://login.salesforce.com/");
	}

	@Test
	public void usingValidCredentials() throws IOException {

		Properties prop = new Properties();
		try {
			FileInputStream  file = new FileInputStream(System.getProperty("user.dir")+"\\config\\credential.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		LoginPage login = new LoginPage();
		login.EnterUsername(prop.getProperty("username"));
		login.EnterPass(prop.getProperty("password"));
		login.clickLogin();

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
