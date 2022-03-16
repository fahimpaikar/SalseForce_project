package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature",glue ="stepDefinition", dryRun = true, monochrome = false, plugin = {"pretty","html:Report/Cucumber-Report",
		"json:Report/Cucumber-Json/report.json",
		})
public class TestRunner {

}
