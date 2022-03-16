package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Event_Content_Assignment extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		
		openBrowser( "firefox","http://qa.ibextechnologies.us/d8site/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='edit-name']")).sendKeys("fahimpaikar");
		driver.findElement(By.cssSelector("input[id='edit-pass']")).sendKeys("Welcome1@2020");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"toolbar-item-administration-tray\"]/nav/div[1]/ul/li/a")).click();
		driver.findElement(By.cssSelector("a[class='btn btn-xs btn-success']")).click();
		driver.findElement(By.linkText("Event")).click();
		driver.findElement(By.cssSelector("input[name='title[0][value]']")).sendKeys("Event at the National Mall");
		driver.findElement(By.id("edit-body-0-summary")).sendKeys("No Summary is Needed for this Event");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='cke_wysiwyg_frame cke_reset']")));
		driver.findElement(By.xpath("/html/body")).sendKeys("This is the discreption field");
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("input[id='edit-field-event-type-515']")).click();
		WebElement yearField = driver.findElement(By.name("field_start_date[0][value][year]"));
		Select year = new Select (yearField);
		year.selectByVisibleText("2020");
		WebElement monthField = driver.findElement(By.name("field_start_date[0][value][month]"));
		Select month = new Select(monthField);
		month.selectByVisibleText("Nov");
		WebElement dayField = driver.findElement(By.name("field_start_date[0][value][day]"));
		Select day = new Select(dayField);
		day.selectByVisibleText("22");
		WebElement hourfield = driver.findElement(By.name("field_start_date[0][value][hour]"));
		Select hour = new Select(hourfield);
		hour.selectByIndex(6);
		WebElement minuteField = driver.findElement(By.name("field_start_date[0][value][minute]"));
		Select minute = new Select(minuteField);
		minute.selectByVisibleText("30");
		WebElement amPm = driver.findElement(By.name("field_start_date[0][value][ampm]"));
		Select ampm = new Select(amPm);
		ampm.selectByVisibleText("am");
		WebElement endYear = driver.findElement(By.name("field_end_date[0][value][year]"));
		Select eyear = new Select(endYear);
		eyear.selectByVisibleText("2021");
		WebElement endMonth = driver.findElement(By.name("field_end_date[0][value][month]"));
		Select eMonth = new Select(endMonth);
		eMonth.selectByVisibleText("Nov");
		WebElement endDay = driver.findElement(By.name("field_end_date[0][value][day]"));
		Select eDay = new Select (endDay);
		eDay.selectByVisibleText("21");
		WebElement endHour = driver.findElement(By.name("field_end_date[0][value][hour]"));
		Select eHour = new Select(endHour);
		eHour.selectByVisibleText("6");
		WebElement endMinute = driver.findElement(By.name("field_end_date[0][value][minute]"));
		Select eMinute = new Select (endMinute);
		eMinute.selectByVisibleText("45");
		WebElement eamPm = driver.findElement(By.name("field_end_date[0][value][ampm]"));	
		Select eAmPm = new Select(eamPm);
		eAmPm.selectByVisibleText("am");
		driver.findElement(By.name("field_location[0][value]")).sendKeys("Washington D.C.");
		WebElement fileUpload = driver.findElement(By.name("files[field_image_0]"));
		fileUpload.sendKeys("C:\\Users\\fahim\\eclipse-workspace\\BatchThreeSelenium1\\testData\\FDR.jpg.png");
		driver.findElement(By.name("field_image[0][alt]")).sendKeys("National Mall");
		driver.findElement(By.name("revision_log[0][value]")).sendKeys("I just added an image.");
		WebElement opt = driver.findElement(By.name("moderation_state[0][state]"));
		Select oPt = new Select (opt);
		oPt.selectByVisibleText("Published");
		driver.findElement(By.cssSelector("button[id='edit-submit']")).click();
		
		
		
		

	}

}
