package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Day02 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://codegator.herokuapp.com/Home.php");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("By Tag")).click();
		WebElement selectfield = driver.findElement(By.tagName("select"));
		Select selectValue = new Select(selectfield);
		selectValue.selectByIndex(1);
		selectValue.selectByValue("2");
		selectValue.selectByVisibleText("Three");
		driver.findElement(By.linkText("form")).click();
		driver.findElement(By.className("form-check-input")).click();
		String termsAndCondition = driver.findElement(By.className("form-check-label")).getText();
		System.out.println(termsAndCondition);
		
		WebElement firstNameField = driver.findElement(By.id("validationCustom01"));
		firstNameField.clear();
		firstNameField.sendKeys("Fahim");
		
		
		
		driver.close();

	}

}
