package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_Day07_Iframe extends Utilities {

	public static void main(String[] args) {

		openBrowser("firefox", "http://codegator.herokuapp.com/iframe.php");
//		driver.switchTo().frame("frame1").findElement(By.id("username")).sendKeys("Fahim");// this method is using
//																							// String value(name)
//		driver.switchTo().frame(1).findElement(By.id("username")).sendKeys("fahim");// this method is using integer
//																					// value ( index) of the frame in
		// the page
		WebElement frameOne = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameOne).findElement(By.id("username")).sendKeys("Fahim");// this method is using
																							// WebElement to find the
																							// frame
		driver.switchTo().defaultContent(); // this method will take us out of the frame one to the main window
		driver.switchTo().frame("frame2").findElement(By.id("username")).sendKeys("Paikar"); // here we switch to frame
																								// 2 and enter the text
																								// in username field
		

	}

}
