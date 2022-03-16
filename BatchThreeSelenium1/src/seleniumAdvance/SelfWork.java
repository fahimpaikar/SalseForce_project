package seleniumAdvance;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;

public class SelfWork extends Utilities {

	public static void main(String[] args) throws IOException {
		
		openBrowser("firefox","https://finviz.com/");
		//verifyLinks();
		Set<Cookie> siteCookies = driver.manage().getCookies();
		System.out.println(siteCookies.size());
		for(Cookie cookie : siteCookies) {
			System.out.println(cookie.getName());
		}
		

	}

}
