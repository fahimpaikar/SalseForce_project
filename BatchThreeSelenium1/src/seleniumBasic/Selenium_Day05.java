package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.EofException;

public class Selenium_Day05 {

	public static void main(String[] args) throws EofException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://codegator.herokuapp.com/login.php");
		driver.manage().window().maximize();
		java.util.List<WebElement> gender = driver.findElements(By.cssSelector("input[type='radio']"));

		for (WebElement i : gender) {
			if (i.isSelected()) {
				System.out.println(" is already Selected");
			} else {
				i.click();
			}
		}

		driver.navigate().to("http://codegator.herokuapp.com/bytag.php");
		WebElement dropDown = driver.findElement(By.cssSelector("select[class='custom-select custom-select-lg mb-3']"));
		Select options = new Select(dropDown);

		java.util.List<WebElement> allOptions = options.getOptions();
		System.out.println(allOptions.size());

		for (WebElement i : allOptions) {
			if (i.isSelected()) {
				String selectValue = i.getText();
				System.out.println(selectValue);
			} else {
				System.out.println(i.getText() + " Was not selected.");
			}
			
			driver.navigate().to("https://www.facebook.com");
			WebElement dMonth = driver.findElement(By.id("month"));
			Select months = new Select(dMonth);
			java.util.List<WebElement> allMonths = months.getOptions();
			
			for(WebElement e:allMonths) {
				if(e.isSelected()) {
					System.out.println(e.getText());
				}
			} 
			
			
		}

	}

}
