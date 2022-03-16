package com.classwork.testng.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.classwork.testng.utilities.Utilities;

public class OpportunitiesPage  extends Utilities {

	@FindBy(linkText="Opportunities")WebElement oppTab;
	@FindBy(css="input[title='New']")WebElement newbutton;
	@FindBy(css="input[name='opp3']")WebElement oppName;
	@FindBy(css="input[title='Save']")WebElement saveButton;
	@FindBy(id="opp6")WebElement leadSource;
	@FindBy(id="00N8c00000FLKYk") WebElement dStatus;
	@FindBy(xpath="//*[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/div[2]")WebElement errMsg;

	public OpportunitiesPage() {
		PageFactory.initElements(driver, this);
	}
	

	public void clickOppTab() {
		oppTab.click();

	}

	public void clickNewBtn() {
		newbutton.click();
	}

	public void enterOppName() {

		if(oppName.isDisplayed()) {
			oppName.sendKeys("New Opp");
			System.out.println("The oppotunity name field is present");
		} else {
			System.out.println("The field is not prestent");
		}
	}

	public void clickSaveBtn() {
		saveButton.click();
	}

	public void verifyleadSource() {

		Select a = new Select(leadSource);
		List<WebElement> opt = a.getOptions(); // i got all the options from the page

		String[] expectedOptions = { "--None--", "Web", "Phone Inquiry", "Partner Referral",
				"Purchased List", "Other" };

		for (int i = 0; i < opt.size(); i++) {
			Assert.assertEquals(opt.get(i).getText(), expectedOptions[i]);

		}
	}


	public void verifydStatus() {
		Select b = new Select(dStatus);
		List<WebElement> opt = b.getOptions(); // i got all the options from the page

		String[] expdOptions = { "--None--", "In progress", "Yet to begin", "Completed"};

		for (int i = 0; i < opt.size(); i++) {
			Assert.assertEquals(opt.get(i).getText(), expdOptions[i]);
		}

	}
}