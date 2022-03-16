package seleniumTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Assignment_DeleteAcc {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser", "url", "userName", "Pass" })
	public void openBrowser(String browser, String url, String userName, String Pass) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else {
			System.out.println("Please select a proper internetbrowser.");
		}
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(Pass);
		driver.findElement(By.id("Login")).click();
	}

	@Test
	@Parameters({ "name"})
	public void account(String name) throws InterruptedException {
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.cssSelector("input[name='new']")).click();
		driver.findElement(By.id("acc2")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='save']")).click();
		driver.findElement(By.linkText("Accounts")).click();
		List<WebElement> records = driver.findElements(By.tagName("a"));
		
		
		for(WebElement names: records) {
			String myName = names.getText();
			if(myName.equalsIgnoreCase(name)) {
				driver.findElement(By.linkText(name)).click();
				break;
			}
		
		}
		driver.findElement(By.cssSelector("#topButtonRow > input:nth-child(4)")).click();
		driver.switchTo().alert().accept();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}

