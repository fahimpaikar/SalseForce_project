package seleniumTestNG;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_Day1_Example {
	WebDriver driver;

	@BeforeMethod()
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	}

	@Test(enabled = false,description = "This method creates a new account in salesforce")
	public void CreateAccount() throws InterruptedException {

		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("batch03@codegator.us.qa");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Pa55word");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='new']")).click();
		driver.findElement(By.cssSelector("input[id='acc2']")).sendKeys("Fahim Paikar1");

		String mainWindow = driver.getWindowHandle();// id for the main window
		driver.findElement(By.id("acc3_lkwgt")).click();
		Set<String> bothWindows = driver.getWindowHandles();// id for both windows main and pop up window
		Iterator<String> childWindow = bothWindows.iterator();
		while (childWindow.hasNext()) {
			String window = childWindow.next();
			if (!mainWindow.equals(window)) {// this means if the id is not equal to main window id
				driver.switchTo().window(window);// here we switch to the pop up window
				driver.switchTo().frame(driver.findElement(By.id("searchFrame")));// here we go to the frame inside pop
																					// up
				driver.findElement(By.id("lksrch")).sendKeys("Waqas");
				driver.findElement(By.name("go")).click();
				driver.switchTo().window(window);// here we get out of the frame to the pop up window
				Thread.sleep(3000);
				driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));// here we go to the frame inside pop
				Thread.sleep(3000); // up

				// here we go back to the results
				// frame
				List<WebElement> cellValue = driver.findElements(By.xpath("//a[@class=' dataCell ']"));
				for (WebElement data : cellValue) {
					String cellData = data.getText();
					System.out.println(cellData);
					if (cellData.contains("waqas")) {
						data.click();
						break;
					}
				}
			}
		}
		driver.switchTo().window(mainWindow);

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

	}

	@Test // here we are prioritizing which method to run first and so on
	public void VerifyLogin() {
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("batch03@codegator.us.qa");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Pa55word");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
	}

	@Test(enabled = false) // this will skip running this method
	public void SiteTitle() {
		String expectedTitle = "Login | Salesforce";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test()
	public void verifyFeilds() throws InterruptedException {
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("batch03@codegator.us.qa");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Pa55word");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='new']")).click();
		boolean accountName = driver.findElement(By.id("acc2")).isDisplayed();
		Assert.assertTrue(accountName);
		boolean parentAccount = driver.findElement(By.id("acc3")).isDisplayed();
		Assert.assertTrue(parentAccount);
		boolean lookupIcon = driver.findElement(By.className("lookupIcon")).isDisplayed();
		Assert.assertTrue(lookupIcon);
		boolean accNum = driver.findElement(By.id("acc5")).isDisplayed();
		Assert.assertTrue(accNum);
		boolean accSite = driver.findElement(By.id("acc23")).isDisplayed();
		Assert.assertTrue(accSite);
		WebElement type = driver.findElement(By.id("acc6"));
		String[] expectedText = { "--None--", "Prospect", "Customer - Direct", "Customer - Channel",
				"Channel Partner / Reseller", "Installation Partner", "Technology Partner", "Other" };
		Select selType = new Select(type);
		List<WebElement> actualValue = selType.getOptions();
		for (int i = 0; i < actualValue.size(); i++) {
			Assert.assertEquals(expectedText[i], actualValue.get(i).getText());
		}
		boolean indus = driver.findElement(By.id("acc7")).isDisplayed();
		Assert.assertTrue(indus);
		boolean anReven = driver.findElement(By.id("acc8")).isDisplayed();
		Assert.assertTrue(anReven);
		String[] expectedVal = { "--None--", "Hot", "Warm", "Cold" };
		WebElement rate = driver.findElement(By.id("acc9"));
		Select sel = new Select(rate);
		List<WebElement> selrate = sel.getOptions();
		for (int i = 0; i < selrate.size(); i++) {
			Assert.assertEquals(expectedVal[i], selrate.get(i).getText());
		}
//		boolean phone = driver.findElement(By.id("acc10")).isDisplayed();
//		Assert.assertTrue(phone);
//		boolean fax = driver.findElement(By.id("acc11")).isDisplayed();
//		Assert.assertTrue(fax);
		boolean webSite = driver.findElement(By.id("acc12")).isDisplayed();
		Assert.assertTrue(webSite);
		boolean tickerSymbol = driver.findElement(By.id("acc13")).isDisplayed();
		Assert.assertTrue(tickerSymbol);
		String[] expectedOwnerShip = { "--None--", "Public", "Private", "Subsidiary", "Other" };
		WebElement ownership = driver.findElement(By.id("acc14"));
		Select sell = new Select(ownership);
		List<WebElement> list = sell.getOptions();
		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i).getText(), expectedOwnerShip[i]);
		}
		boolean employees = driver.findElement(By.id("acc15")).isDisplayed();
		Assert.assertTrue(employees);
		boolean sicCode = driver.findElement(By.id("acc16")).isDisplayed();
		Assert.assertTrue(sicCode);
		boolean billingAdd = driver.findElement(By.id("acc17street")).isDisplayed();
		Assert.assertTrue(billingAdd);
		boolean billingCity = driver.findElement(By.id("acc17city")).isDisplayed();
		Assert.assertTrue(billingCity);
		boolean billingState = driver.findElement(By.id("acc17state")).isDisplayed();
		Assert.assertTrue(billingState);
		boolean billingZip = driver.findElement(By.id("acc17zip")).isDisplayed();
		Assert.assertTrue(billingZip);
		boolean billingCountry = driver.findElement(By.id("acc17country")).isDisplayed();
		Assert.assertTrue(billingCountry);
		boolean shippingStrt = driver.findElement(By.id("acc18street")).isDisplayed();
		Assert.assertTrue(shippingStrt);
		boolean shippingCity = driver.findElement(By.id("acc18city")).isDisplayed();
		Assert.assertTrue(shippingCity);
		boolean shippingState = driver.findElement(By.id("acc18state")).isDisplayed();
		Assert.assertTrue(shippingState);
		boolean shippingZip = driver.findElement(By.id("acc18zip")).isDisplayed();
		Assert.assertTrue(shippingZip);
		boolean shippingCountry = driver.findElement(By.id("acc18country")).isDisplayed();
		Assert.assertTrue(shippingCountry);
		String[] customerPriority = { "--None--", "High", "Low", "Medium" };
		WebElement custmrPriority = driver.findElement(By.id("00N6g000009om72"));
		Select sele = new Select(custmrPriority);
		List<WebElement> customers = sele.getOptions();
		for (int i = 0; i < customers.size(); i++) {
			String actualCus = customers.get(i).getText();
			Assert.assertEquals(actualCus, customerPriority[i]);
		}
		boolean expiration = driver.findElement(By.id("00N6g000009om75")).isDisplayed();
		Assert.assertTrue(expiration);
		boolean locations = driver.findElement(By.id("00N6g000009om73")).isDisplayed();
		Assert.assertTrue(locations);
		String[] active = { "--None--", "No", "Yes" };
		WebElement activeState = driver.findElement(By.id("00N6g000009om71"));
		Select act = new Select(activeState);
		List<WebElement> activeSt = act.getOptions();
		for (int i = 0; i < activeSt.size(); i++) {
			String actualactive = activeSt.get(i).getText();
			Assert.assertEquals(actualactive, active[i]);
		}
		String[] expectedAls = { "--None--", "Gold", "Silver", "Platinum", "Bronze" };
		WebElement aLs = driver.findElement(By.id("00N6g000009om74"));
		Select se = new Select(aLs);
		List<WebElement> actualAls = se.getOptions();
		for (int i = 0; i < actualAls.size(); i++) {
			String actuall = actualAls.get(i).getText();
			Assert.assertEquals(actuall, expectedAls[i]);
		}
		boolean serialNum = driver.findElement(By.id("00N6g000009om76")).isDisplayed();
		Assert.assertTrue(serialNum);
		String[] expectedUpsell = { "--None--", "Maybe", "No", "Yes" };
		WebElement upSellOp = driver.findElement(By.id("00N6g000009om77"));
		Select upSell = new Select(upSellOp);
		List<WebElement> UpSell = upSell.getOptions();
		for (int i = 0; i < UpSell.size(); i++) {
			String actualUpSell = UpSell.get(i).getText();
			Assert.assertEquals(actualUpSell, expectedUpsell[i]);
		}
	}

	@Test(enabled = false)
	public void VerifyLogo() throws Exception {
		boolean logoPresent = driver.findElement(By.id("logo")).isDisplayed();
		Assert.assertTrue(logoPresent);
	}

	@AfterMethod
	public void tearDwon() {
		driver.quit();
	}

}
