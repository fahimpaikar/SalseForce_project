package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import utilities.UtilitiesCucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(dryRun= false, 
features= "features", 
glue="stepDefinition",
tags= "@task",
format= {"pretty","html:Report/cucumber-Report"})
public class FirstCucumberTask extends UtilitiesCucumber {

	// for hooks we don't need to add anything in the feature file or runner class 
	// as long as hooks are in the stepDifinition package they will get executed before and after every scenario
}
