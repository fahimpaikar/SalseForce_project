package seleniumAdvance;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Contacts_Assignment extends SalesForceLogin {

	public static void main(String[] args) throws InterruptedException, IOException {

		salesForceLogin("batch03@codegator.us.qa", "Pa55word");

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.cssSelector("input[name='new']")).click();
		WebElement prefix = driver.findElement(By.id("name_salutationcon2"));
		Select preFix = new Select(prefix);
		preFix.selectByVisibleText("Mr.");
		driver.findElement(By.id("name_firstcon2")).sendKeys("Arnold");
		driver.findElement(By.id("name_lastcon2")).sendKeys("Schwarzenegger");

		lookupFeild("a[id='con4_lkwgt']", "Fahim Paikar1");

		driver.findElement(By.cssSelector("input[id='con5']")).sendKeys("Manager");
		driver.findElement(By.cssSelector("input[id='con6']")).sendKeys("Information Technology");
		driver.findElement(By.cssSelector("input[id='con7']")).click();
		WebElement monthPick = driver.findElement(By.id("calMonthPicker"));
		Select month = new Select(monthPick);
		month.selectByValue("4");
		WebElement yearpick = driver.findElement(By.id("calYearPicker"));
		Select year = new Select(yearpick);
		year.selectByVisibleText("2022");
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='calDays']//tr//td"));
		for (WebElement date : dates) {
			String day = date.getText();
			if (day.equals("15"))
				;
			date.click();
			break;
		}

		lookupFeild("a[id='con8_lkwgt']", "John Doe");
		
		ScreenShot(driver, "Second LookUp");

		driver.findElement(By.cssSelector("input[type='submit']")).click();
		WebElement leads = driver.findElement(By.cssSelector("select[id='con9']"));
		Select lead = new Select(leads);
		lead.selectByVisibleText("Web");
		driver.findElement(By.cssSelector("input[id='con10']")).sendKeys("8045678910");
		driver.findElement(By.cssSelector("input[id='con13']")).sendKeys("8045678910");
		driver.findElement(By.cssSelector("input[id='con12']")).sendKeys("7034567890");
		driver.findElement(By.cssSelector("input[id='con14']")).sendKeys("9083457862");
		driver.findElement(By.cssSelector("input[id='con11']")).sendKeys("9087654321");
		driver.findElement(By.cssSelector("input[id='con15']")).sendKeys("Johndoe@gmail.com");
		driver.findElement(By.cssSelector("input[id='con16']")).sendKeys("Ashley");
		driver.findElement(By.cssSelector("input[id='con17']")).sendKeys("9087654301");
		driver.findElement(By.cssSelector("textarea[id='con19street']")).sendKeys("123 Nothingham Rd");
		driver.findElement(By.cssSelector("input[id='con19city']")).sendKeys("Richmond");
		driver.findElement(By.cssSelector("input[id='con19state']")).sendKeys("Virginia");
		driver.findElement(By.cssSelector("input[id='con19zip']")).sendKeys("22487");
		driver.findElement(By.cssSelector("input[id='con19country']")).sendKeys("United States");

		driver.findElement(By.cssSelector("textarea[id='con18street']")).sendKeys("123 Nothingham Rd");
		driver.findElement(By.cssSelector("input[id='con18city']")).sendKeys("Richmond");
		driver.findElement(By.cssSelector("input[id='con18state']")).sendKeys("Virginia");
		driver.findElement(By.cssSelector("input[id='con18zip']")).sendKeys("22487");
		driver.findElement(By.cssSelector("input[id='con18country']")).sendKeys("United States");
		driver.findElement(By.cssSelector("input[id='00N6g000009om7C']")).sendKeys("English");
		WebElement level = driver.findElement(By.cssSelector("select[id='00N6g000009om7D']"));
		Select eLevel = new Select(level);
		eLevel.selectByVisibleText("Primary");
		driver.findElement(By.cssSelector("textarea[id='con20']")).sendKeys("No description needed.");
		driver.findElement(By.cssSelector("input[name='save']")).click();
		driver.findElement(By.cssSelector("input[name='save']")).click();
		ScreenShot(driver, "Contacts");
	}

}
