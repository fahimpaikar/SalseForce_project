package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://codegator.herokuapp.com");
		driver.findElement(By.linkText("login")).click();

		driver.findElement(By.id("username")).sendKeys("fagunoau@gmail.com");

		driver.findElement(By.id("basic-url")).sendKeys("Fahim.paikar");
		driver.findElement(By.name("vehicle1")).click();
		driver.findElement(By.name("vehicle2")).click();
		driver.findElement(By.name("vehicle3")).click();
		driver.findElement(By.partialLinkText("Practice Multiple Windows")).click();
		// driver.close();

	}

}
