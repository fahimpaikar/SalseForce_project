package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_Day09_Task extends Utilities {

	public static void main(String[] args) {

		openBrowser("firefox","https://money.rediff.com/gainers/bse/daily/groupa");
		List<WebElement> links = driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
		for (WebElement tata : links) {
			if (tata.getText().equalsIgnoreCase("Tata Consultancy"));
				driver.findElement(By.linkText("Tata Consultancy")).click();
			break;
		}
		WebElement text = driver.findElement(By.xpath("//*[@id=\"for_BSE\"]/p"));
		System.out.println(text.getText());

	}

}
