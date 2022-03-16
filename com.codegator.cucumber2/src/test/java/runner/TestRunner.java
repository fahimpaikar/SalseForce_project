package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", 
monochrome= true, dryRun = false,
publish =true,
plugin= {"pretty:STDOUT","rerun:rerun/failed_scenario.txt"},
glue = "stepDefinitions")
public class TestRunner {

	
	
}
