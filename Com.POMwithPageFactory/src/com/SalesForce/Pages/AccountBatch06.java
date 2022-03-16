package com.SalesForce.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.SalesForce.Utilities.Utilities;

public class AccountBatch06 extends Utilities {

	@FindBy(name = "new")
	WebElement newButton;
	@FindBy(id="acc6")
	WebElement selectType;
	@FindBy(id="acc2")
	WebElement accountName;
	@FindBy(id="acc9")
	WebElement rating;
	@FindBy(xpath ="//img[@title='Parent Account Lookup (New Window)']")
	WebElement parentAccount;
	@FindBy(id="00N8c00000FLKYV")
	WebElement slaDate;
	@FindBy(id = "lksrch")
	WebElement searchBox;
	@FindBy(name = "go")
	WebElement goBtn;
	@FindBy(id="acc5") WebElement accountNumber;
	@FindBy(id="00N8c00000FLKYV") WebElement slaDatePicker;
	@FindBy(xpath = "//td[@class='pbButtonb']//input[@value=' Save ']") WebElement saveButton;
	@FindBy(xpath = "//a[@class=' dataCell ']")
	List<WebElement> dataTable;
	
	public AccountBatch06() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickNewButton() {
		newButton.click();
		
	}
	
	public void selectType(String type) {
		Select selRating = new Select(rating);
		selRating.deselectByValue(type);
		
	}
	
	public void enterAccountNumber() {
		
	}
	
	
	
	
}
