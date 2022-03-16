package seleniumTestNG1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Day03 {

	@Test(groups = { "smoke", "regression", "sprint2" })
	public void test() {
		System.out.println("this come from another package.");
		Assert.assertTrue(false);// this will forcefully fail this method
	}

	@Test(groups = { "smoke" }, dependsOnMethods = "test") // here we are saying that this method depend on
																		// "test" method
																		// if the first method fails this method will
	 // here this method depends on passage of test cases
									 							// grouped as smoke if any of test cases grouped as
																// smoke fails this will be skipped // fail too
																// otherwise it will run
	public void test1() {
		System.out.println("This comes from second test.");
	}

	@Test(groups = { "sprint2", "smoke" })
	public void test2() {
		System.out.println("This comes from third method.");
	}

}
