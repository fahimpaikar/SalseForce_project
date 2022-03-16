package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_Day16_Recap extends Utilities {

	public static void main(String[] args) {

		openBrowser("chrome", "http://codegator.herokuapp.com/input_fields.php");
		List<WebElement> allCheckboxes = driver.findElements(By.cssSelector("input[type=\"radio\"]"));
		System.out.println(allCheckboxes.size());
		for (WebElement checkbox : allCheckboxes) {
			String checkboxValue = checkbox.getAttribute("value");
			System.out.println(checkboxValue);
			if (checkboxValue.equals("option2")) { // Option 1 is for male and option 2 is for Female
				checkbox.click();
			}
		}

	}

}