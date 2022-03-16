package com.SalesForce.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SalesForce.Utilities.Utilities;

public class Dashboard extends Utilities {

	@FindBy (id="setupLink") WebElement setupLink;
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifySetupLink() {
		boolean setupPresent = setupLink.isDisplayed();
		Assert.assertTrue(setupPresent);
		
		Assert.assertTrue(setupLink.isDisplayed());
		
	}
}
