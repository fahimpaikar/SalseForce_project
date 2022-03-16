package seleniumAdvance;

import java.util.Set;

import org.openqa.selenium.Cookie;

public class Selenium_Day14_Cookies extends Utilities {

	public static void main(String[] args) {
		openBrowser("firefox", "https://www.kayak.com/");
		Set<Cookie> siteCookies = driver.manage().getCookies();
		System.out.println(siteCookies.size());
		for (Cookie Cookiename : siteCookies) {
			String cookieName = Cookiename.getName();
			System.out.println(cookieName);
		}

		driver.manage().deleteCookieNamed("Apache");
		Set<Cookie> afterdeletingOne = driver.manage().getCookies();
		System.out.println(afterdeletingOne.size());
		//driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies().size());
		
		Cookie newcookie = new Cookie("alretKey","123");
		driver.manage().addCookie(newcookie);
		System.out.println(driver.manage().getCookies().size());
		for(Cookie newCookie : siteCookies) {
			String newCoookieName = newCookie.getName();
			System.out.println(newCoookieName);
		}
		
	}

}
