package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_Day09_WebTables extends Utilities {

	public static void main(String[] args) {
		
		openBrowser("firefox","http://codegator.herokuapp.com/tables.php");
		List <WebElement> headerCol = driver.findElements(By.cssSelector("th[scope='col']"));
		System.out.println("The total number of columns are: "+ headerCol.size());
		List <WebElement>rowSize = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
		System.out.println("The total number of rows are: "+ rowSize.size());
		String cellVal = driver.findElement(By.xpath("//table//tbody//tr[3]//td[2]")).getText();
		System.out.println(cellVal);
		List<WebElement> allNames = driver.findElements(By.xpath("//table//tbody//tr//td"));
		for(WebElement oneName: allNames) {
			String name = oneName.getText();
			if(name.equalsIgnoreCase("otto"));
			driver.findElement(By.linkText("Otto")).click();
			break;
		}
//		
//		newWebsite("https://www.flydulles.com/iad/arrivals-and-departures?airlinelist=All&locationList=Atlanta&dateList=05%2F05%2F2020");
//		List <WebElement> dullesCol = driver.findElements(By.xpath("//table//thead//div//div"));
//		System.out.println("The total number of columns for dulles tabel is: "+dullesCol.size());
//		List <WebElement> dRows = driver.findElements(By.xpath("//table//tbody//tr"));
//		System.out.println("The total number of rows are: "+dRows.size());
//		
//		
		
		
		

	}

}
