package seleniumAdvance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeProject_tstngtst {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver1.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("batch03@codegator.us.qa");
		driver.findElement(By.id("password")).sendKeys("Pa55word");
		driver.findElement(By.id("Login")).click();
		
		String name = "Paikar";
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.cssSelector("input[name='new']")).click();
		driver.findElement(By.id("acc2")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='save']")).click();
		driver.findElement(By.linkText("Accounts")).click();
		List<WebElement> records = driver.findElements(By.tagName("a"));
		System.out.println(records.size());
		
		for(WebElement names: records) {
			String myName = names.getText();
			if(myName.equalsIgnoreCase(name)) {
				driver.findElement(By.linkText(name)).click();
				break;
			}
		
		}
		
		Thread.sleep(3000);
		WebElement delete = driver.findElement(By.cssSelector("#topButtonRow > input:nth-child(4)"));
		delete.click();
		driver.switchTo().alert().accept();
		

	}

}
