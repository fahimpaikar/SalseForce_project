package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utilities.UtilitiesCucumber;

public class FirstCucumberTaskTest extends UtilitiesCucumber {

	@When("^I click The \"([^\"]*)\" button$")
	public void I_click_The_button(String buttonName) {
		driver.findElement(By.name(buttonName)).click();
	}

	@When("^I click the \"([^\"]*)\" tab$")
	public void I_click_the_tab(String link) {
		driver.findElement(By.linkText(link)).click();
	}

	@Then("^I am on \"([^\"]*)\" home page$")
	public void I_am_on_home_page(String expectedPage) {
		String ActualPage = driver.findElement(By.className("pageType")).getText();
		String expPage = expectedPage;
		Assert.assertEquals(expPage, ActualPage);
	}

	@Then("^I select \"([^\"]*)\" from Rating field$")
	public void I_select_from_Rating_field(String value) {

		WebElement rates = driver.findElement(By.id("acc9"));
		Select sel = new Select(rates);
		sel.selectByVisibleText(value);
	}
	
	@When("^I click \"([^\"]*)\" button$")
	public void I_click_button(String name) {
		
		driver.findElement(By.name(name)).click();
	} 
	
	
	@When("^I enter \"([^\"]*)\" for \"([^\"]*)\" field$")
	public void I_enter_for_field(String accName, String locator)  {
	    driver.findElement(By.id(locator)).sendKeys(accName);
	}

	@When("^I select \"([^\"]*)\" from \"([^\"]*)\" field$")
	public void I_select_from_field(String rates, String locator) {
	    WebElement rating = driver.findElement(By.id(locator));
	    Select rate = new Select(rating);
	    rate.selectByVisibleText(rates);
	}

}
