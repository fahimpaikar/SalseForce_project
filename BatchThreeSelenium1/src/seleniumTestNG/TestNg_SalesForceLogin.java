package seleniumTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_SalesForceLogin {
	WebDriver driver;

	@Parameters({ "browserName", "url", "userName", "passWord", "name", "type" }) // to read data from xml file and this
																					// is the "Key"
	@Test
	public void login(String browserName, String url, String userName, String passWord, String name, String type)
			throws InterruptedException {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		} else {
			System.out.println("Please select a proper browser.");
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(passWord);
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		driver.findElement(By.linkText("Accounts")).click();
	
		driver.findElement(By.cssSelector("input[name='new']")).click();
		
		driver.findElement(By.id("acc2")).sendKeys(name);
		WebElement typ = driver.findElement(By.id("acc6"));

		Select sel = new Select(typ);
		sel.selectByVisibleText(type);

	}

}
