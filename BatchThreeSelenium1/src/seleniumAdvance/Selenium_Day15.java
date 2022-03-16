package seleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Selenium_Day15 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		// Set directory where we need to store the file
		profile.setPreference("browser.download.dir", "C:\\Users\\fahim\\OneDrive\\Documents\\Batch3 downloads");
		profile.setPreference("browser.download.folderList", 2);
		//MIME Type
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet; 	application/vnd.ms-excel");
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://qa.ibextechnologies.us/d8site/node/349");
		driver.findElement(By.linkText("Book1.xlsx")).click();

	}

}
