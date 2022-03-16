package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay02_Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.ibextechnologies.us/d8site/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.linkText("user/register")).click();
		driver.findElement(By.id("edit-name")).sendKeys("fahimpaikar@gmail.com");
		driver.findElement(By.id("edit-pass")).sendKeys("Welcome1");
		driver.findElement(By.id("edit-submit")).click();
		driver.close();

	}

}
