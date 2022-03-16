package seleniumBasic;

import java.io.IOException;
import org.openqa.selenium.By;
import seleniumAdvance.Utilities;

public class Canvas extends Utilities {

	public static void main(String[] args) throws IOException {

		openBrowser( "chrome","https://canvas.instructure.com");
		driver.findElement(By.id("pseudonym_session_unique_id")).sendKeys("fahimpaikar@gmail.com");
		driver.findElement(By.id("pseudonym_session_password")).sendKeys("Musawir@2011");
		driver.findElement(By.xpath("//div/form/div[3]/div/button")).click();
		driver.switchTo().parentFrame();
		
		ScreenShot(driver, "Canvas");
		

		
	}

}
