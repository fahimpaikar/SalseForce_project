package seleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Day06 {
	WebDriver driver;

	// login using XML
	@Parameters({ "browserName", "url", "userName", "passWord" })
	@BeforeMethod // this method will run and log me in before the test method
	public void salesForcelogin(String browserName, String url, String userName, String passWord)
			throws InterruptedException {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please select a proper browser.");
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(passWord);
		driver.findElement(By.cssSelector("input[name='Login']")).click();
	}

	@Test(dataProvider = "feildData")
	public void createAccount(String accName, String accNumber, String name, String accSite, String type, String inds,
			String annRev) throws InterruptedException {

		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("acc2")).sendKeys(accName);
		driver.findElement(By.id("acc3")).sendKeys(name);
		driver.findElement(By.id("acc23")).sendKeys(accSite);
		driver.findElement(By.id("acc5")).sendKeys(accNumber);
		WebElement typ = driver.findElement(By.id("acc6"));
		Select sel = new Select(typ);
		sel.selectByVisibleText(type);
		WebElement indstry = driver.findElement(By.id("acc7"));
		Select ind = new Select(indstry);
		ind.selectByVisibleText(inds);
		driver.findElement(By.id("acc8")).sendKeys(annRev);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.name("save")).click();

	}

	@DataProvider
	public Object[][] feildData() {

		Object[][] accInfo = { { "Fahim", "250003435", "Waqas", "Dandoo", "Prospect", "Banking", "20B" },
				{ "Qayoom", "658484638", "Waqas", "Bandoo", "Customer - Channel", "Construction", "35B" },
				{ "Haidari", "5486519498", "Waqas", "Jandoo", "Installation Partner", "Education", "60B" },
				{ "Essazada", "26195161", "Waqas", "Candoo", "Customer - Channel", "Energy", "2B" },
				{ "Noori", "8798465162", "Waqas", "Mandoo", "Technology Partner", "Healthcare", "106B" } };
		return accInfo;
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
