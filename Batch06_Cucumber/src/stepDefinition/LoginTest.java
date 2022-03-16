package stepDefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest {
	static WebDriver driver;

	@Given("^I open chrome browser$")
	public void I_open_chrome_browser( )   {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	}

	@Given("^I enter valid username in username field$")
	public void I_enter_valid_username_in_username_feild()   {
		driver.findElement(By.id("username")).sendKeys("batch06@codegator.us.qa");
	}

	@Given("^I enter valid password in password field$")
	public void I_enter_valid_password_in_password_feild()  {
		driver.findElement(By.id("password")).sendKeys("Welcome1");
	}

	@When("^I click the login button$")
	public void I_click_the_login_button()   {
		driver.findElement(By.id("Login")).click();
	}

	@Then("^I should see the dashboard page$")
	public void I_should_see_the_dashboard_page()   {
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		Assert.assertTrue(driver.findElement(By.id("setupLink")).isDisplayed());
	}

	@Then("^I should see the accounts link in the menu$")
	public void I_should_see_the_accounts_link_in_the_menu()   {
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		Assert.assertTrue(driver.findElement(By.xpath("//a[@title='Accounts Tab']")).isDisplayed());

	}

	@Then("^I click the logout button$")
	public void I_click_the_logout_button()   {
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[@title='Logout']")).click(); 
	}

	@Given("^I enter \"([^\"]*)\" in the username field$")
	public void I_enter_in_the_username_field(String username)  {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("^I enter \"([^\"]*)\" in the password field$")
	public void I_enter_in_the_password_field(String password)  {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("^I close the chrome browser$")
	public void I_close_the_chrome_browser()  {
		driver.quit();
	}
	@Then("^I click the \"([^\"]*)\" tab$")
	public void I_click_the_tab(String tabName)  {
		driver.findElement(By.linkText(tabName)).click();
	}

	@When("^I click the \"([^\"]*)\" button$")
	public void I_click_the_button(String button)  {
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='"+button+"']")).click();

	}

	@Then("^I enter \"([^\"]*)\" for \"([^\"]*)\" field$")
	public void I_enter_for_field(String accName, String fieldId)  {
		driver.findElement(By.id(fieldId)).sendKeys(accName);
	}

	@Then("^I should be able to see \"([^\"]*)\" text$")
	public void I_should_be_able_to_see_text(String actual)  {
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.MILLISECONDS);
		String recordName = driver.findElement(By.xpath("//*[@id=\"contactHeaderRow\"]/div[2]/h2")).getText();
		Assert.assertEquals(recordName, actual);
	}

	@Then("^I create an account$")
	public void I_create_an_account(DataTable data)  {

		List<Map<String, String>>records= data.asMaps();
		for(Map<String, String> record: records) {

			driver.findElement(By.linkText("Accounts")).click();
			driver.manage().timeouts().implicitlyWait(200,TimeUnit.MILLISECONDS);
			driver.findElement(By.name("new")).click();
			driver.findElement(By.id("acc2")).sendKeys(record.get("Account Name"));
			driver.findElement(By.id("acc5")).sendKeys(record.get("Account Number"));
			WebElement salRating =driver.findElement(By.id("acc9"));
			Select sel = new Select(salRating);
			sel.selectByVisibleText(record.get("Rating"));


			driver.findElement(By.name("save")).click();
		}
	}


	@Then("^I should see the following options for \"([^\"]*)\" the drop down field$")
	public void I_should_see_the_following_options_for_the_drop_down_field(String fieldName, DataTable values) {
		List<String> rows= values.asList(String.class);
		WebElement val = driver.findElement(By.id(fieldName));
		Select selRating = new Select(val);
		List<WebElement> opt = selRating.getOptions();
		for(int i =0; i< rows.size();i++) {
			Assert.assertEquals(rows.get(i), opt.get(i).getText());
		}


	}

	@Then("^I search and select \"([^\"]*)\" from \"([^\"]*)\"$")
	public void I_search_and_select_from(String parentAccount, String searchIcon)  {
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.className("lookupIcon")).click();
		Set<String> bothWindows = driver.getWindowHandles();
		Iterator<String> itrWindow = bothWindows.iterator();
		while(itrWindow.hasNext()) {
			String childWindow = itrWindow.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.switchTo().frame(0);
				driver.findElement(By.id(searchIcon)).sendKeys(parentAccount);
				driver.findElement(By.xpath("//input[@name='go']")).click();
				driver.switchTo().defaultContent();
				driver.switchTo().frame(1);
				driver.findElement(By.linkText(parentAccount)).click();
				driver.switchTo().window(parentWindow);

			}

		}


	}

	@Then("^I select SLA expiration date$")
	public void I_select_SLA_expiration_date()  {

		driver.findElement(By.xpath("//input[@id='00N8c00000FLKYV']")).sendKeys("03/07/2022");
	}

}
