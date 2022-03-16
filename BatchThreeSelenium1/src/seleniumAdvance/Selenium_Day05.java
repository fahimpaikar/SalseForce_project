package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day05 extends Utilities {

	public static void main(String[] args) {
		
		openBrowser("chorme","http:\\codegator.herokuapp.com\\login.php");
        driver.findElement(By.linkText("By Tag")).click();
        WebElement selectField = driver.findElement(By.tagName("select"));
        Select dropDown = new Select(selectField);
        dropDown.selectByVisibleText("Three");
        
        
        
        
        
        
	}

}
