package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

// after creating this class we need specify where our feature file is, we add two @s RunWith and Cucumber
// after that we right click and run this as a jUnit, in the console we should be able to see the step definitions 
//here we are specifying to run any scenarios with tag2 or Assignment tags {"@tag2,@Assignment1"}
// this will run all the scenarios which has both tags {"@tag2","@Assignment1"}
// this will skip running a scenario with mentioned tag {"~@Assignment1"}
@RunWith(Cucumber.class)
@Cucumber.Options(features="Features",
glue = "stepDefinition", 
dryRun = false, 
tags = {"@tag1, @Assignment1"},
format = {"pretty","html:target/cucumber-report"})
public class TestRunner {

}
