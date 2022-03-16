package com.SalesForce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SalesForce.Utilities.Utilities;

public class LoginPage extends Utilities {

	// POM using the Page Factory
	// step 1 use FindBy annotation to instantiate webElements
	@FindBy(id = "username")
	WebElement usernameField;
	@FindBy(id = "password")
	WebElement passwordFeild;
	@FindBy(id = "Login")
	WebElement loginButton;

	// Step 2 Initializing the elements within the constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void EnterUsername(String username) {
		usernameField.sendKeys(username);
	}

	public void EnterPass(String pass) {
		passwordFeild.sendKeys(pass);
	}

	public void clickLogin() {
		loginButton.click();
	}

}
