package seleniumTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Day1 {

	@Test
	public void exampleOne() {
		System.out.println("This is a test ng annotation.");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is a before suite annotation.");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is an after suite annotation.");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is a before class annotation.");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is an after class annotation.");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("This is a before group annotation.");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("This is an after group annotation.");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is a before method annotation.");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is an after method annotation.");
	}

	@Test
	public void methodTwo() {
		System.out.println("This is a test ng annotation from method two.");
	}

}
