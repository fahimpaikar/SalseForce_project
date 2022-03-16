package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day05_practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// submit method only works with forms and will submit the details you put in
		// the form.
		driver.get("http://codegator.herokuapp.com/form.php");
		driver.findElement(By.cssSelector("button[type='submit']")).submit();

		WebElement feedBackText = driver.findElement(By.xpath("/html/body/div/form/div[1]/div[3]/div/div[2]"));
		String attributeName = feedBackText.getAttribute("class");// this method will return the attribute of the
																	// WebElement
		System.out.println(attributeName);
		String textFromApp = feedBackText.getText();// get text method will get the text which is visible in the web app

		System.out.println(textFromApp);
		String textFromClient = "Enter the Username";// this is the text which client has requested to be shown
		System.out.println(textFromClient);
		if (textFromApp.equalsIgnoreCase(textFromClient)) {// this method will compare the two texts we will compare
															// ignoring the capitalization
			System.out.println("The text from app matches the requirements");
		} else {
			System.out.println("The two Texts do not match.");
		}

	}

}
