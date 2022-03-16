package com.salseFroce.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.salseFroce.utilities.Utilities;

public class LoginPage extends Utilities {

	By usernameField = By.id("username");
	By passwordField = By.id("password");
	By loginButton = By.id("Login");
	By errorText = By.id("error");

	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	public void errorMessage() {
		String errortext = driver.findElement(errorText).getText();
		Assert.assertEquals(errortext,
				"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
	}

}
