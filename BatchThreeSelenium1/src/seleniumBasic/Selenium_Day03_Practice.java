package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day03_Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qa.ibextechnologies.us/d8site/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.cssSelector("img[alt='Home']"));
		if (logo.isDisplayed()) {
			System.out.println("The logo is present.");
		} else {
			System.out.println("The logo is not present.");
		}

		// driver.close();

		driver.navigate().to("http://codegator.herokuapp.com/index.php");
		;
		WebElement pButton = driver.findElement(By.id("simpleBtn"));
		if (pButton.isEnabled()) {
			System.out.println("The button is enabled.");
			pButton.click();
		} else {
			System.out.println("The button is disabled.");
		}

		driver.findElement(By.linkText("login")).click();

		WebElement checkBox = driver.findElement(By.name("vehicle3"));
		System.out.println(checkBox.isSelected());

	}

}
