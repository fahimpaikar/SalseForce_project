package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Day08_MouseActions extends Utilities {

	public static void main(String[] args) {
		
		openBrowser("firefox","https://www.flydulles.com/iad/dulles-international-airport");
		Actions action = new Actions(driver);
		WebElement parkingLink = driver.findElement(By.partialLinkText("Parking"));
		action.moveToElement(parkingLink).perform();
		WebElement rentalCar = driver.findElement(By.linkText("Rental Cars"));
		action.moveToElement(rentalCar).click().perform();
		
		WebElement shopping = driver.findElement(By.partialLinkText("Shopping"));
		action.moveToElement(shopping).perform();
		WebElement contact = driver.findElement(By.linkText("Contact Us"));
		action.moveToElement(contact).click().perform();
		WebElement dullesPh = driver.findElement(By.xpath("//*[@id=\"block-system-main\"]/div/section[2]/div[2]/div/p[5]"));
		System.out.println("Phone number for dulles airport is: "+dullesPh.getText());
//		action.contextClick();// this method will right click on a WebElement.
//		action.doubleClick();// this method will double click on the WebElement.
//		action.dragAndDrop(contact, dullesPh);// this method will double click on a WebElement.
		
		driver.navigate().to("https://www.demoqa.com/droppable/");
		WebElement box1 = driver.findElement(By.id("draggable"));
		WebElement box2 = driver.findElement(By.id("droppable"));
		action.clickAndHold(box1).perform();
		action.moveToElement(box2).perform();
		action.release(box1).perform();
		
		action.dragAndDrop(box1, box2);
		

	}

}
