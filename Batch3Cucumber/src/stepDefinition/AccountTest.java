package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.UtilitiesCucumber;

public class AccountTest extends UtilitiesCucumber {

	@When("^I click Accounts tab$")
	public void I_click_Accounts_tab() {
		driver.findElement(By.linkText("Accounts")).click();
	}

	@Then("^I am Accounts homepage$")
	public void I_am_Accounts_homepage() {
		String currentUrl = driver.getCurrentUrl();
		String expectedurl = "https://na174.salesforce.com/001/o";
		Assert.assertEquals(currentUrl, expectedurl);
	}

	@Then("^I click the new button$")
	public void I_click_the_new_button() {

		driver.findElement(By.name("new")).click();
	}

	@Then("^I enter Account Name field$")
	public void I_enter_Account_Name_field() {
		driver.findElement(By.id("acc2")).sendKeys("Fahim");
	}

	@When("^I should see the Rating field$")
	public void I_should_see_the_Rating_field() {
		boolean ratingField = driver.findElement(By.id("acc9")).isDisplayed();
		Assert.assertTrue(ratingField);
	}

	@When("^I select Hot from the Rating field$")
	public void I_select_Hot_from_the_Rating_field() {
		WebElement rating = driver.findElement(By.id("acc9"));
		Select rate = new Select(rating);
		rate.selectByVisibleText("Hot");
	}

	@When("^I click the save button$")
	public void I_click_the_save_button() {
		driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]")).click();
	}

	@Then("^I should see the Account record$")
	public void I_should_see_the_Account_record() {
		String accountName = driver.findElement(By.cssSelector("#contactHeaderRow > div.textBlock > h2")).getText();
		Assert.assertEquals(accountName, "Fahim");
	}

	@When("^I create an Account$")
	public void I_create_an_Account(DataTable accountDetails) {

		List<Map<String, String>> accountData = accountDetails.asMaps();
		for (Map<String, String> data : accountData) {
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.name("new")).click();
			driver.findElement(By.id("acc2")).sendKeys(data.get("Account Name"));
			WebElement rating = driver.findElement(By.id("acc9"));
			Select rates = new Select(rating);
			rates.selectByValue(data.get("Rating"));
			driver.findElement(By.id("acc5")).sendKeys(data.get("Account Number"));
			driver.findElement(By.id("acc12")).sendKeys(data.get("Account Site"));
			driver.findElement(By.name("save")).click();
		}

	}

}
