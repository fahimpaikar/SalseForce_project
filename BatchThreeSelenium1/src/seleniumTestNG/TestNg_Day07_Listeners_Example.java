package seleniumTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Day07_Listeners_Example {
	
	@BeforeMethod
	public void methodOne() {
		System.out.println("This is coming from before method.");
	}
	
	@Test
	public void methodTwo() {
		System.out.println("This is our first test method.");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void methodThree() {
		System.out.println("This is printing from after method.");
	}
	
	@Test
	public void methodFour() {
		System.out.println("This is printing from second test method.");
		
	}
	
	@Test
	public void methodFive() {
		System.out.println("This is printing form third methods.");
	}
	
	

}
