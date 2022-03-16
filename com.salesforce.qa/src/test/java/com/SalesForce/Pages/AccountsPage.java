package com.SalesForce.Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.SalesForce.Utilities.Utilities;

public class AccountsPage extends Utilities {

	@FindBy(linkText = "Accounts")
	WebElement accountTab;
	@FindBy(css = "input[name='new']")
	WebElement newButton;
	@FindBy(id = "acc2")
	WebElement accName;
	@FindBy(id = "acc3")
	WebElement parentAcc;
	@FindBy(id = "acc5")
	WebElement accNumber;
	@FindBy(id = "acc23")
	WebElement accSite;
	@FindBy(id = "acc6")
	WebElement accType;
	@FindBy(id = "acc7")
	WebElement accIndustry;
	@FindBy(id = "acc8")
	WebElement annualRev;
	@FindBy(id = "acc9")
	WebElement rating;
	@FindBy(id = "acc12")
	WebElement webSite;
	@FindBy(id = "acc13")
	WebElement symbol;
	@FindBy(id = "acc14")
	WebElement ownership;
	@FindBy(id = "acc15")
	WebElement employees;
	@FindBy(id = "acc16")
	WebElement sicCode;


	@FindBy(css = "#topButtonRow > input:nth-child(1)")
	WebElement saveButton;

	public AccountsPage() {
		PageFactory.initElements(driver, this);

	}

	public void clickAccountTab() {
		accountTab.click();
	}

	public void clickNewButton() {
		newButton.click();
	}

	public void enterAccName() throws IOException {
		//initProperty(File.separator + "config" + File.separator + "credential.properties");
		accName.sendKeys(prop.getProperty("accountName"));
	}

	public void enterParentAcc() throws IOException {
		//initProperty(File.separator + "config" + File.separator + "credential.properties");
		parentAcc.sendKeys(prop.getProperty("parentAccount"));
	}

	public void enterAccountNumber() throws IOException {
		//initProperty(File.separator + "config" + File.separator + "credential.properties");
		accNumber.sendKeys(prop.getProperty("accountNumber"));
	}

	public void enterAccSite() throws IOException {
		//initProperty(File.separator + "config" + File.separator + "credential.properties");
		accSite.sendKeys(prop.getProperty("accountSite"));
	}
	
	public void selectType(String accountType) {
		Select type = new Select(accType);
		type.selectByVisibleText(accountType);
	}
	
	public void selectIndustry(String industry) {
		Select sel = new Select(accIndustry);
		sel.selectByVisibleText(industry);
	}
	
	public void enterAnnualRevenur() throws IOException {
		//initProperty(File.separator+"config"+File.separator+"credential.properties");
		annualRev.sendKeys(prop.getProperty("annualRevenue"));
	}
	
	public void selectRating(String ratings) {
		Select select = new Select(rating);
	    select.selectByVisibleText(ratings);
	}
	
	public void enterWebSite() throws IOException {
		//initProperty(File.separator+"config"+File.separator+"credential.properties");
		webSite.sendKeys(prop.getProperty("accountWebSite"));
	}
	
	public void enterSymbol() throws IOException {
		//initProperty(File.separator+"config"+File.separator+"credential.properties");
		webSite.sendKeys(prop.getProperty("symbol"));
	}
	
	public void selectOwnerShip(String ownerShip) {
		Select sel = new Select(ownership);
		sel.selectByVisibleText(ownerShip);
	}
	
	public void enterEmployees() {
		employees.sendKeys(prop.getProperty("numberOfEmployees"));
	}
	
	public void enterSicCode() {
		sicCode.sendKeys("sicCode");
	}
	
	
	
	

	public void clickSave() {
		saveButton.click();
	}

}
