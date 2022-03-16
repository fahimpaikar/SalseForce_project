package com.SalesForce.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {
	public static Properties prop;
	public static WebDriver driver;

	public void openBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver1.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		} else {
			System.out.println("Please select a valid browser.");
		}
	}
	
	
	
	
	// with this method we will access the variables saved in the properties file saved in cofig folder.
	public Properties initProperty(String filePath) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+filePath);
		prop.load(fis);
		return prop;
		
	}
	
public void salesForceLogin() throws IOException {
		
		initProperty(File.separator+"config"+File.separator+"credential.properties");
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("validUsername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.id("Login")).click();
	}



public Object [][] readData (String filePath, String sheetName) throws IOException{
	String datafile = filePath;
	FileInputStream fis = new FileInputStream(datafile);
	@SuppressWarnings("resource")
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet(sheetName);
	int rows = sheet.getLastRowNum();
	rows = rows+1;// this will show the total number of rows
	int totalCells = sheet.getRow(0).getLastCellNum();// this will retrun 2
	Object[][]excelData = new Object[rows-1][totalCells];
	for(int i=1;i<rows;i++) {
		for(int j =0; j<totalCells;j++) {
			excelData[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
		}
	}
	
	return excelData;
	
}
	
	
	

	public void tearDown() {
		driver.quit();
	}

}
