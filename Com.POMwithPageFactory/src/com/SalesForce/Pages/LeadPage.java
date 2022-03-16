package com.SalesForce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.SalesForce.Utilities.Utilities;

public class LeadPage extends Utilities {
	
	
	@FindBy(linkText="Leads")WebElement leadTab;
	@FindBy(css="input[title='New']")WebElement newbutton;
	@FindBy(id = "name_salutationlea2") WebElement selectSalutation;
	@FindBy(id ="name_firstlea2")WebElement firstName;
	@FindBy(id="name_lastlea2")WebElement lastName;
	@FindBy(id="lea3")WebElement companyName;
	@FindBy(id="lea4")WebElement title;
	@FindBy(id="lea5")WebElement selectLeadSource;
	@FindBy(className ="lookupIcon") WebElement lookUp;
	
	@FindBy(css="input[name='save']")WebElement saveButton;
	
	
	public LeadPage () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickLeadTab () {
		leadTab.click();
	}
	
	public void clickNewButton () {
		newbutton.click();
	}
	
	public void selectSalut(String salutation) {
		Select saluTation = new Select(selectSalutation);
		saluTation.selectByVisibleText(salutation);
	}
	
	public void EnterName(String Fname) {
		firstName.sendKeys(Fname);
	}
	
	public void EnterLastName (String LName) {
		lastName.sendKeys(LName);
	}
	
	
	public void EnterCompany(String CName) {
		companyName.sendKeys(CName);
	}
	
	public void ClickSave() {
		saveButton.click();
	}
	
	
	

}
