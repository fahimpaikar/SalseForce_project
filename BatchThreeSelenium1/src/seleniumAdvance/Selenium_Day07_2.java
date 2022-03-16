package seleniumAdvance;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_Day07_2 extends Utilities {

	public static void main(String[] args) {

		openBrowser("firefox","http://codegator.herokuapp.com/alert.php");
		driver.findElement(By.id("simpleBtn")).click();
		Alert alertBox = driver.switchTo().alert();// this method will switch the focus from the page to the pop up
													// alert
		String alertText = alertBox.getText();// this method will get the alert text
		System.out.println(alertText);
		alertBox.accept();// this method will be used for the simple alerts and will click / accept the ok
							// button in alert box
		
		driver.findElement(By.id("confirmBtn")).click();
		
		String confirmation = alertBox.getText();
		System.out.println(confirmation);
		alertBox.dismiss();// this method will dismiss the alert
	//	alertBox2.accept();// this method will accept the alert
		
		driver.findElement(By.id("promptBtn")).click();
		driver.switchTo().alert().sendKeys("fahim paikar");
		alertBox.accept();
		WebElement demo = driver.findElement(By.cssSelector("p[id='demo']"));
		String demoText = demo.getText();
		System.out.println(demoText);
		
		

	}

}
