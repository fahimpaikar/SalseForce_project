package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Selenium_Day13_Javascriptexecuter extends Utilities {

	public static void main(String[] args) {

		openBrowser("firefox","https://www.flydulles.com/iad/dulles-international-airport");

		JavascriptExecutor js = ((JavascriptExecutor) driver);// JavaScript is an interface that we instantiate here
		js.executeScript("window.scrollBy(0, 1200)");// this will scroll down the window for 1200 pixels
		
		WebElement link = driver.findElement(By.partialLinkText("Dulles International Hosts Social"));
		js.executeScript("arguments[0].scrollIntoView(true);", link);// this will scroll until a specified WebEelement is visible
		
		js.executeScript("arguments[0].click();", link);// this method will click on a specified WebElement
		String webTxt =js.executeScript("return document.documentElement.innerText;").toString();// this will get us all the text present in a specified webPage
		System.out.println(webTxt);// here we are printing out the text we got from the webPage

	}

}
