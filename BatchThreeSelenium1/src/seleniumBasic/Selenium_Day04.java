package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Day04 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		String URL1 = "https://www.udacity.com/course/java-developer-nanodegree--nd035";
		String URL2 = "https://www.google.com";
		driver.get(URL1); // get method will not maintain the browsing history. navigate method does keep
							// the cookies and browsing history.
		driver.manage().window().maximize();// this method will maximize the browser window
		Thread.sleep(2000);// this method will add 2 seconds of wait time.
		driver.navigate().to(URL2);// will keep the browsing history and cookies
		driver.navigate().refresh();// this method will refresh the page that we are in.
		driver.navigate().back();// this method will take us back to the previous page just like the backward
									// arrow in the browser
		driver.navigate().forward();// this method will take us to the next page if we have in our browser history.

		driver.get("http://codegator.herokuapp.com/form.php");
		WebElement fName = driver.findElement(By.id("validationCustom01"));

		fName.clear();// this method will clear the pre existed text in a box.
		fName.sendKeys("Fahim Jan");
		driver.close();

	}

}
