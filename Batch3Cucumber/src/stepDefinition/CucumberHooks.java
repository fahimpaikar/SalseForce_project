package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
 
	@Before()
	public void methodOne() {
		System.out.println("Hooks which don't have any order number will have the least priority for execution");
	}
	
	@After
	public void methodTwo() {
		System.out.println("This is an after hook, it will get executed after every scenario");
	}
	
	@Before(order=0)
	public void methodThree() {
		System.out.println("Method with lowest order number will have the highest priority for execution");
	}
	
	@Before("@SprintOne")
	public void methodFour() {
		System.out.println("Hooks having specific tags will only get executed before/after scenarios having the same tags ");
	}
	
	@After({"@SprintOne","@SprintTwo"})
	public void methodFive() {
		System.out.println("One hook can have many tags");
	}
	
	@After(value="@Accounts",order=2)
	public void methodSix () {
		System.out.println("In case we need to use order and scenario tag with the same hook");
	}
	
	
	
	
}
