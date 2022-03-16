package seleniumAdvance;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesForceSignUp extends Utilities {

	public static void main(String[] args) throws InterruptedException, IOException {

		openBrowser( "chrome","https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("batch03@codegator.us.qa");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Pa55word");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.cssSelector("input[name='new']")).click();
		driver.findElement(By.cssSelector("input[id='acc2']")).sendKeys("Fahim Paikar1");
		
		lookupFeild("a[id='acc3_lkwgt']","Waqas");
		
		driver.findElement(By.cssSelector("input[id='acc5']")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[id='acc23']")).sendKeys("Codegator");
		WebElement type = driver.findElement(By.cssSelector("select[id='acc6']"));
		Select selectType = new Select(type);
		selectType.selectByVisibleText("Installation Partner");
		WebElement industry = driver.findElement(By.cssSelector("select[id='acc7']"));
		Select indus = new Select(industry);
		indus.selectByVisibleText("Government");
		driver.findElement(By.cssSelector("input[id='acc8']")).sendKeys("$290.98 B");
		WebElement rating = driver.findElement(By.cssSelector("select[id='acc9']"));
		Select rate = new Select(rating);
		rate.selectByVisibleText("Warm");
		driver.findElement(By.cssSelector("input[id='acc10']")).sendKeys("5718454830");
		driver.findElement(By.cssSelector("input[id='acc11']")).sendKeys("5718299924");
		driver.findElement(By.cssSelector("input[id='acc12']")).sendKeys("www.Myselfie.com");
		driver.findElement(By.cssSelector("input[id='acc13']")).sendKeys("DELTA");
		WebElement ownership = driver.findElement(By.cssSelector("select[id='acc14']"));
		Select owner = new Select(ownership);
		owner.selectByVisibleText("Private");
		driver.findElement(By.cssSelector("input[id='acc15']")).sendKeys("5400");
		driver.findElement(By.cssSelector("input[id='acc16']")).sendKeys("CODE");
		driver.findElement(By.xpath("//*[@id=\"acc17street\"]")).sendKeys("1234 Nowheres Rd");
		driver.findElement(By.cssSelector("input[id='acc17city']")).sendKeys("Nolandssburg");
		driver.findElement(By.cssSelector("input[id='acc17state']")).sendKeys("Virginia");
		driver.findElement(By.cssSelector("input[id='acc17zip']")).sendKeys("22974");
		driver.findElement(By.cssSelector("input[id='acc17country']")).sendKeys("United States");
		driver.findElement(By.cssSelector("textarea[id='acc18street']")).sendKeys("1234 Nowheres Rd");
		driver.findElement(By.cssSelector("input[id='acc18city']")).sendKeys("Nolandssburg");
		driver.findElement(By.cssSelector("input[id='acc18state']")).sendKeys("Virginia");
		driver.findElement(By.cssSelector("input[id='acc18zip']")).sendKeys("22974");
		driver.findElement(By.cssSelector("input[id='acc18country']")).sendKeys("United States");
		WebElement customer = driver.findElement(By.cssSelector("select[id='00N6g000009om72']"));
		Select customerP = new Select(customer);
		customerP.selectByVisibleText("High");

		driver.findElement(By.cssSelector("input[id='00N6g000009om75']")).click();
		WebElement monthPicker = driver.findElement(By.id("calMonthPicker"));
		Select month = new Select(monthPicker);
		month.selectByVisibleText("April");
		WebElement yearPicker = driver.findElement(By.id("calYearPicker"));
		Select year = new Select(yearPicker);
		year.selectByVisibleText("2022");
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='calDays']//tr//td"));
		for (WebElement date : dates) {
			String day = date.getText();
			if (day.equals("12")) {
				date.click();
				break;
			}
		}

		driver.findElement(By.cssSelector("input[id='00N6g000009om73']")).sendKeys("23");
		WebElement status = driver.findElement(By.cssSelector("select[id='00N6g000009om71']"));
		Select active = new Select(status);
		active.selectByValue("Yes");
		WebElement sla = driver.findElement(By.cssSelector("select[id='00N6g000009om74']"));
		Select sLa = new Select(sla);
		sLa.selectByVisibleText("Gold");
		driver.findElement(By.cssSelector("input[id='00N6g000009om76']")).sendKeys("37232663");
		WebElement upsell = driver.findElement(By.cssSelector("select[id='00N6g000009om77']"));
		Select upSell = new Select(upsell);
		upSell.selectByVisibleText("Yes");
		driver.findElement(By.cssSelector("textarea[id='acc20']"))
				.sendKeys("This page is completely filled out by Fahim Paikar");

		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
		
		ScreenShot(driver, "SalesForceAccount");

	}

}
