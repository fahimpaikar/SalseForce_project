package seleniumTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Day04 {

	@Parameters({ "browserName", "userName" }) // to read data from xml file and this is the "Key"
	@Test
	public void login(String browserName, String user) {
		System.out.println("Browser name is " + browserName);
		System.out.println("Username is " + user);
	}

}
