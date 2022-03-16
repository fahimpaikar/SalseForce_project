package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day03 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://codegator.herokuapp.com/");
		// driver.findElement(By.xpath("html/body/div/button[3]")).click();
		driver.findElement(By.xpath("html/body/div/div/nav/a[8]")).click();
		driver.findElement(By.id("validationCustom01")).clear();
		driver.findElement(By.id("validationCustom01")).sendKeys("Fahim");
		driver.findElement(By.id("validationCustom02")).clear();
		driver.findElement(By.id("validationCustom02")).sendKeys("Paikar");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("FahimPaikar");
		driver.findElement(By.xpath("html/body/div/form/div[2]/div/input")).sendKeys("Alexandria");
		driver.findElement(By.id("validationCustom04")).clear();
		driver.findElement(By.id("validationCustom04")).sendKeys("VA");
		driver.findElement(By.id("validationCustom05")).clear();
		driver.findElement(By.id("validationCustom05")).sendKeys("22406");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		// locating a web element using contains method
		WebElement fName = driver.findElement(By.xpath("//input[contains(@placeholder,'First')]"));
		fName.clear();
		fName.sendKeys("Fahim");
		WebElement lName = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Last')]"));
		lName.clear();
		lName.sendKeys("Paikar");
		driver.findElement(By.linkText("login")).click();
		WebElement userName = driver.findElement(By.cssSelector("input#username"));// tag and name
		userName.sendKeys("using CSS locator");
		WebElement alerts = driver.findElement(By.linkText("Alerts"));
		alerts.click();
		// driver.findElement(By.cssSelector("button[class='btn
		// btn-outline-primary']")).click();// tag and class
		alerts.click();
		// driver.findElement(By.cssSelector("button.btn.btn-outline-primary")).click();//
		// tag and class
		// finding locators using ^ symbol in css locator
		// driver.findElement(By.cssSelector("button[class^=btn]")).click();
		// use of $ symbol to search the class by ending value
		driver.findElement(By.cssSelector("button[class$='ary']")).click();
		// use of * symbol in search of class for contain specific characters
		// driver.findElement(By.cssSelector("button[class*='out']")).click();
		

	}

}
