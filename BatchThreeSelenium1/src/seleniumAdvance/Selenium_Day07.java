package seleniumAdvance;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Selenium_Day07 extends Utilities {

	public static void main(String[] args) {

		openBrowser("chrome", "http://codegator.herokuapp.com/drop_down.php");
		WebElement states = driver.findElement(By.xpath("/html/body/div/div[4]/div/div[2]/select"));
		Select state = new Select(states);
		state.selectByIndex(4);
		state.selectByValue("VA");
		state.selectByVisibleText("Alabama");
		state.selectByVisibleText("Utah");
		state.deselectByVisibleText("Utah");
		state.isMultiple();// this method will let us know if in a field multiple values can be selected

		driver.navigate().to("https://www.google.com");
		WebElement helloSearch = driver.findElement(By.cssSelector("input[title='Search']"));
		helloSearch.sendKeys("Hello");
		helloSearch.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"xjs\"]/div/table/tbody/tr/td[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[8]/div/div[1]/a/h3")).click();
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement Link = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement helloLink = driver.findElement(By.linkText("Adele – Hello Lyrics | Genius Lyrics"));
				if (helloLink.isEnabled()) {
					System.out.println("Element is present");
				}
				return helloSearch;
			}
		});

	}
}
