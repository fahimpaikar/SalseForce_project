package seleniumAdvance;

import org.openqa.selenium.By;

public class SalesForceLogin extends Utilities {

	public static void salesForceLogin (String user, String pass ) {
		openBrowser("chrome","https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(user);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		
	}
	
}
