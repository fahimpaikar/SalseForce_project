package seleniumAdvance;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Day15_Chrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fahim\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://qa.ibextechnologies.us/d8site/node/349");
		WebElement file = driver.findElement(By.linkText("Book1.xlsx"));
		file.click();
		String fileName = file.getText();
		System.out.println(fileName);
		String fLocation = "C:\\Users\\fahim\\Downloads\\"+fileName;
		File filePath = new File(fLocation);
		Thread.sleep(3000);
		if(filePath.exists()) {
			System.out.println("The file is downloaded.");
		} else {
			System.out.println("The file is not downloaded.");
		}
		
		driver.navigate().to("http://qa.ibextechnologies.us/d8site/node/346");
		String parentWindow = driver.getCurrentUrl();
		driver.findElement(By.linkText("behat-file.pdf")).click();
		Set<String> bothWindows = driver.getWindowHandles();
		for(String window : bothWindows) {
			if(!parentWindow.equals(window)) {
				driver.switchTo().window(window);
			}
			String childWindowUrl = driver.getCurrentUrl();
			if(childWindowUrl.contains("behat-file.pdf")) {
				System.out.println("Verified the pdf file");
			} else {
				System.out.println("PDF does not exist");
			}
		}

	}

}
