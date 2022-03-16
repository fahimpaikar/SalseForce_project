package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun= false, 
features= "feature", 
glue="stepDefinition",
plugin= {"pretty","html:Report/cucumber-Report"})
public class TestRunner {

	// for hooks we don't need to add anything in the feature file or runner class 
	// as long as hooks are in the stepDifinition package they will get executed before and after every scenario
}
