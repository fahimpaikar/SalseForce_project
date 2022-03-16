package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_FacebookSignUp extends Utilities {

	public static void main(String[] args) {

		openBrowser("firefox","https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Doe");
		driver.findElement(By.cssSelector("input[id='u_0_r']")).sendKeys("JohnDoe@gmail.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("input[name='reg_email_confirmation__']")));
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("JohnDoe@gmail.com");
		driver.findElement(By.cssSelector("input[data-type='password']")).sendKeys("Welcom1");
		WebElement bMonth = driver.findElement(By.xpath("//*[@id=\"month\"]"));

		Select month = new Select(bMonth);
		month.selectByVisibleText("Feb");
		WebElement bDay = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day = new Select(bDay);
		day.selectByVisibleText("22");
		WebElement bYear = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year = new Select(bYear);
		year.selectByVisibleText("2009");
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.linkText("Sign Up")).click();

	}

}
