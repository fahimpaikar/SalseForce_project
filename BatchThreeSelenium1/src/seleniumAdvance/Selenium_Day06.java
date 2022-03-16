package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Day06 extends Utilities {

	public static void main(String[] args) {

		openBrowser("firefox","http://qa.ibextechnologies.us/d8site/");
		driver.findElement(By.linkText("Log in")).click();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// this
		// method will give the page 20 seconds
		// time to load first and then look for the
		// locator
		driver.findElement(By.id("edit-name")).sendKeys("fahim");
		driver.findElement(By.id("edit-pass")).sendKeys("torachee");
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.cssSelector("inpu[id='u_0_8']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);// example of explicit wait when we have to wait for a
															// secondary element to show up based on our first selection
															// in the webPage
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='custom_gender']")));

	}

}
