package seleniumAdvance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class Selenium_Day08MultipleWindows extends Utilities {

	public static void main(String[] args) {

		openBrowser( "firefox","http://codegator.herokuapp.com/MultipleWindows.php");
		String parentWindow = driver.getWindowHandle();// this method will get the unique ID of the window which is
														// created by Selenium
		System.out.println(parentWindow);// this unique id is always changing
		driver.findElement(By.partialLinkText("facebook")).click();// using this link we are opening another window from
																	// a parent window
		Set<String> childWindows = driver.getWindowHandles();//this method will store the unique ids from both windows into a set. 
//		System.out.println(childWindow.size());
//		driver.switchTo().window(parentWindow);// when we want switch back to the parent window after opening the child window we use this method.
//		driver.findElement(By.linkText("Form")).click();
//		driver.switchTo().window(parentWindow);
//		driver.findElement(By.id("email")).sendKeys("Waqas");
//		driver.findElement(By.linkText("Form")).click();
//		
		Iterator<String> itrWindow = childWindows.iterator();
		while (itrWindow.hasNext()) {
			String childWindow = itrWindow.next();
			if (parentWindow.equals(childWindow)) {
				System.out.println("You are on parent window");
			} else {
				driver.switchTo().window(childWindow);
				driver.findElement(By.id("email")).sendKeys("Fahim");
			}

		}

	}

}
