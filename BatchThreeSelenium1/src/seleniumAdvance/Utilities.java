package seleniumAdvance;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {
	public static WebDriver Firefox;
	public static WebDriver Chrome;
	public static String browserName;
	public static WebDriver driver;

	public static void openBrowser(String browserName, String Url) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver1.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please choose a correct browser and url.");
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Url);
		driver.manage().window().maximize();

	}

	public static void ScreenShot(WebDriver driver, String fileName) throws IOException {

		TakesScreenshot takeShots = ((TakesScreenshot) driver);

		// use getScreenShotAs method

		File srcFile = takeShots.getScreenshotAs(OutputType.FILE);

		// specify the location of our destination folder

		File destFolder = new File(".//Screenshot//" + fileName + ".png");// this will add the new screen shot with a
																			// new name
																			// without replacing the previous file.
		// copy the source file to the destination folder

		FileUtils.copyFile(srcFile, destFolder);

	}

	public static void verifyLinks() throws IOException {

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		int workingLinks = 0;
		int notAuthLinks = 0;
		int brokenLinks = 0;
		for (WebElement links : allLinks) {
			String urlLink = links.getAttribute("href");// for image we use src as attribute

			if (urlLink != null) {
				URL link = new URL(urlLink);
				HttpURLConnection conn = ((HttpURLConnection) link.openConnection());
				int responseCode = conn.getResponseCode();
				if (responseCode == 200) {
					workingLinks = workingLinks + 1;
					// System.out.println("This link " + urlLink + " is valid.");
				} else if (responseCode == 403) {
					notAuthLinks = notAuthLinks + 1;
					// System.out.println("Not authorized to access this link " + urlLink);
				} else if (responseCode == 400) {
					brokenLinks = brokenLinks + 1;
					System.out.println("The link is broken " + urlLink);

				}
			}
		}
		System.out.println("The total number of links in this page are: " + allLinks.size());
		System.out.println("The total number of working links is: " + workingLinks);
		System.out.println("The total number of non authorized links is: " + notAuthLinks);
		System.out.println("The total number of broken links are: " + brokenLinks);

	}

	public static void lookupFeild(String cSS ,String name) throws InterruptedException {

		String mainWindow = driver.getWindowHandle();// id for the main window
		driver.findElement(By.cssSelector(cSS)).click();
		Set<String> bothWindows = driver.getWindowHandles();// id for both windows main and pop up window
		Iterator<String> childWindow = bothWindows.iterator();
		while (childWindow.hasNext()) {
			String window = childWindow.next();
			if (!mainWindow.equals(window)) {// this means if the id is not equal to main window id
				driver.switchTo().window(window);// here we switch to the pop up window
				driver.switchTo().frame(driver.findElement(By.id("searchFrame")));// here we go to the frame inside pop
																					// up
				driver.findElement(By.id("lksrch")).sendKeys(name);
				driver.findElement(By.name("go")).click();
				driver.switchTo().window(window);// here we get out of the frame to the pop up window
				Thread.sleep(3000);
				driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));// here we go back to the results
																					// frame
				List<WebElement> cellValue = driver.findElements(By.xpath("//a[@class=' dataCell ']"));
				for (WebElement data : cellValue) {
					String cellData = data.getText();
					System.out.println(cellData);
					if (cellData.contains(name)) {
						data.click();
						break;
					}
				}
			}
		}
		driver.switchTo().window(mainWindow);
	}

	public static void closeBrowser() {
		driver.close();
	}
}
