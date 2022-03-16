package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "Features", 
		glue = "stepDefinition", 
		dryRun = false, 
		monochrome = true, 
		tags = "@Sprint1",
		format= {"pretty","html:Report/Cucumber-Report"}
		) 

public class TestRunner { 

}
//format will create a final report for our test and will create a folder within another folder and save the report in there																															// will
//this ~ sign will run tags except the tags with ~ sign																						
																												
//dryRunn = true will only check for undefined methods in test class.tags will run the features that are tagged same name.																													
//then will notify if there are any undefined features in the class
// monochrome = true will print readable text in console
// monochrome = false will not print readable text in console