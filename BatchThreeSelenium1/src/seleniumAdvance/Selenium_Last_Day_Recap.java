package seleniumAdvance;

import java.util.Set;

import org.openqa.selenium.By;

public class Selenium_Last_Day_Recap extends Utilities {

	public static void main(String[] args) {
		
		openBrowser("chrome", "http://codegator.herokuapp.com/MultipleWindows.php");
		// 1 window = parent window
		String parentWindow = driver.getWindowHandle();
		System.out.println("This is the id of parent window : "+parentWindow);
		driver.findElement(By.linkText("facebook page")).click();
		// 2 windows = 1 will be the parent and 1 will be the child window
		Set<String> childWindows = driver.getWindowHandles();
		// it will return me 2 window id's
		// 1 will be the id of the parent window
		// 2 will be the id of the child window (facebook)
		for(String childWindow: childWindows) {
			if(childWindow.equals(parentWindow)) {
				System.out.println("This is a parent window");
			} else {
				System.out.println("This is a child window");
				driver.switchTo().window(childWindow);
				driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("Waqas");
			}
		}
		
		
		
		
		
		

	}

}
