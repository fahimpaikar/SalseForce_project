package seleniumTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNg_Day07_Listeners implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		System.out.println("The test is getting started...");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The test passed.");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("The test failed.");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("The test is skipped...");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The test barely passed.");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("The test fialed with timeout.");
	}

	public void onStart(ITestContext context) {
		System.out.println("The test is running.");
	}

	public void onFinish(ITestContext context) {
		System.out.println("The test is completed.");
	}
	
	
}
