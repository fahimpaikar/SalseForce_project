package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Assignment02_Article extends Utilities {

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
		
		WebElement fileUpload = driver.findElement(By.name("files[field_image_0]"));
		fileUpload.sendKeys("C:\\Users\\fahim\\eclipse-workspace\\BatchThreeSelenium1\\testData\\SalesForceAccount.png");
		driver.findElement(By.name("field_image[0][alt]")).sendKeys("My Image");

		String description = "This is just a sample text for Description Field";
		WebElement frame1 = driver.findElement(By.cssSelector("iframe[class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(frame1).findElement(By.xpath("/html/body")).sendKeys(description);
		driver.switchTo().defaultContent();
		WebElement saveAs = driver.findElement(By.cssSelector("select[id='edit-moderation-state-0-state"));
		Select saveOptions = new Select(saveAs);
		saveOptions.selectByVisibleText("Published");
		driver.findElement(By.cssSelector("button[id='edit-submit']")).click();
		WebElement Title = driver.findElement(By.cssSelector("h1[class='page-header']"));
		String title = "HOW TO AUTOMATE PUBLISHING AN ARTICLE CONTENT";
		if (Title.getText().equalsIgnoreCase(title)) {
			System.out.println("Your article was published!!!");
		}
		WebElement type = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/section/div/div/div[2]/div/div/h2/a/div"));
		System.out.println("The Article will be available under this tab " + type.getText());
		closeBrowser();

	}

}
