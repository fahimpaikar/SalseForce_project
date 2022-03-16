package seleniumListener;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SeleniumListeners implements ITestListener {
 WebDriver driver;
 String aName;
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Object currnetninstance = result.getInstance();// using this method we are using the driver object in seleniumDay08 class.
		driver = SeleniumDay08.class.cast(currnetninstance).driver;
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.name("go")).click();
		String accountName = SeleniumDay08.class.cast(currnetninstance).accountName;
		List<WebElement>accNames = driver.findElements(By.tagName("a"));
		for(WebElement name : accNames) {
			String aName = name.getText();
			if(aName.equals(accountName)) {
				name.click();
			}
			break;
		}
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='delete']")).click();
		driver.switchTo().alert().accept();
		
	}

	@Override
	public void onTestFailure(ITestResult Screenshot) {
		
		TakesScreenshot takeShots = ((TakesScreenshot) driver);

		// use getScreenShotAs method

		File srcFile = takeShots.getScreenshotAs(OutputType.FILE);

		// specify the location of our destination folder

		File destFolder = new File(".//Screenshot//" + Screenshot.getName() + ".png");// this will add the new screen shot with a
																			// new name
																			// without replacing the previous file.
		// copy the source file to the destination folder

		try {
			FileUtils.copyFile(srcFile, destFolder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
	
	
	
	
	
	
}
