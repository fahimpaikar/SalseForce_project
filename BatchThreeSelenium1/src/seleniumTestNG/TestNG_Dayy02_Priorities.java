package seleniumTestNG;

import org.testng.annotations.Test;

public class TestNG_Dayy02_Priorities {

	@Test // by default the priority is 0, (if priority is not set it assumes it's 0.
	public void firstMethod() {
		System.out.println("This is method number 1.");
	}
	
	@Test(priority =1)
	public void secondMethod() {
		System.out.println("This is method number 2.");
	}
	
	@Test(priority =2)
	public void thirdMethod() {
		System.out.println("This is method number 3.");
	}
	
	@Test(priority = 3)
	public void fourthMethod() {
		System.out.println("This is method number 4.");
	}
	
	
	
}
