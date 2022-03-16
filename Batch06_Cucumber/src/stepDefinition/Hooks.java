package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
   
	
	@Before ("@Assignment1")
	public void start() {
		System.out.println("****** Scenario Started ******");
	}
    
	// we can assign specific before/after hooks based on Scenario tags like above
	// or we can assign hooks based on order like below
    
    
    @After
    public void stop() {
    	LoginTest.driver.quit();
    	System.out.println("****** Scenario Complete *****");
    }
    
    @Before(order=0)
    public void methodOne() {
    	System.out.println("This is before hook which is going to execute 1st");
    }
    
   
    @After(order=0)
    public void methodTwo() {
    	System.out.println("This is after hook which is going to execute 1st");
    }
  
    @Before(order=1)
    public void methodThree() {
    	System.out.println("This is before hook which is going to execute 2nd");
    }
  
    @After(order=1)
    public void methodFour() {
    	System.out.println("This is after hook which is going to execute 2nd");
    }
    
    
}
