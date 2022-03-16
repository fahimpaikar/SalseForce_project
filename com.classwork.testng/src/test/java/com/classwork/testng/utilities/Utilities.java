package com.classwork.testng.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Utilities {
	public static WebDriver driver;	
	public void openBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver1.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		} else {
			System.out.println("Please select a valid browser.");
		}
	}
	
	public void tearDown() {
		driver.quit();
	}

}
