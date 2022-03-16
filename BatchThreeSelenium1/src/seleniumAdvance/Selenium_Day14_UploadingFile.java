package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day14_UploadingFile extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		
		openBrowser( "firefox","http://qa.ibextechnologies.us/d8site/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='edit-name']")).sendKeys("fahimpaikar");
		driver.findElement(By.cssSelector("input[id='edit-pass']")).sendKeys("Welcome1@2020");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"toolbar-item-administration-tray\"]/nav/div[1]/ul/li/a")).click();
		driver.findElement(By.cssSelector("a[class='btn btn-xs btn-success']")).click();
		driver.findElement(By.linkText("Article")).click();
		driver.findElement(By.cssSelector("input[id='edit-title-0-value']"))
				.sendKeys("HOW TO AUTOMATE PUBLISHING AN ARTICLE CONTENT");
		WebElement articleType = driver.findElement(By.cssSelector("select[id='edit-field-tags']"));
		Select aType = new Select(articleType);
		aType.selectByVisibleText("Business");
		
		// the complete code is copied in Assignment02 class how to upload an image into a webpage
		WebElement fileUpload = driver.findElement(By.name("files[field_image_0]"));
		fileUpload.sendKeys("C:\\Users\\fahim\\eclipse-workspace\\BatchThreeSelenium1\\testData\\SalesForceAccount.png");
		driver.findElement(By.name("field_image[0][alt]")).sendKeys("My Image");

	}

}
