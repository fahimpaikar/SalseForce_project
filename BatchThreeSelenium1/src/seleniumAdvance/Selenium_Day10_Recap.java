package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_Day10_Recap extends Utilities {

	public static void main(String[] args) {
		
		openBrowser("firefox","https://money.rediff.com/gainers/bse/daily/groupa");
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		System.out.println(rows.size());
		List <WebElement> columns = driver.findElements(By.xpath("//table//thead//tr//th"));
		System.out.println(columns.size());
		for(int i = 1;i<rows.size();i++) {
			for(int j = 1;j<columns.size();j++) {
				WebElement eachCell = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]"));
				System.out.println(eachCell.getText());
			}
		}
		

	}

}
