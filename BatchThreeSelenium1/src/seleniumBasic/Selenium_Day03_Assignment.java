package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day03_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://codegator.herokuapp.com/login.php");
		driver.manage().window().maximize();
//		
//		List<WebElement> vehicles = driver.findElements(By.cssSelector("input[type='checkbox']"));
//		for(WebElement i: vehicles) {
//			if (i.isSelected()) {
//				System.out.println("The box is already checked");
//			} else {
//				i.click();
//			}
//		}
//		
		WebElement bike = driver.findElement(By.name("vehicle1"));
		if (bike.isSelected()) {
			System.out.println("the box is already checked");
		} else {
			bike.click();
		}
		WebElement car = driver.findElement(By.name("vehicle2"));
		if (car.isSelected()) {
			System.out.println("the box is already checked");
		} else {
			car.click();
		}
		WebElement boat = driver.findElement(By.name("vehicle3"));
		if (boat.isSelected()) {
			System.out.println("the box is already checked");
		} else {
			boat.click();
		}
	}

}
