package seleniumListener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumDay08 {
	WebDriver driver;
    String accountName;

	/*
	 * User should be able to create Account
	 */
	@Parameters({ "browser", "url", "userName", "pass" })
	@BeforeMethod
	public void goToEnv(String browser, String url, String userName, String pass) {
		// specify which browser to use, user name/password & the environment url
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		} else {
			System.out.println("Please select a proper browser i.e chrome/firefox.");
		}

		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("Login")).click();

	}

	
	@Test(dataProvider = "setAccount")
	public void CreateAndDelete(String name, String accNumber) {
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.cssSelector("input[name='new']")).click();
		driver.findElement(By.id("acc2")).sendKeys(name);
		driver.findElement(By.id("acc5")).sendKeys(accNumber);
		driver.findElement(By.cssSelector("input[name='save']")).click();
		
	}
	
	@DataProvider
	public Object[][] setAccount(){
		
		Object [][] fillFields = {
				{"Paikar","7640"}
		};
		return fillFields;
		
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
	
	

}
