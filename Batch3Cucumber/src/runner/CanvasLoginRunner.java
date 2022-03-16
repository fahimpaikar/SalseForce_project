package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import utilities.UtilitiesCucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features= "features",
dryRun = false,
glue= "stepDefinition",
tags="@canvas",
format= {"pretty","html:Report/Cucumber-Report"})
public class CanvasLoginRunner extends UtilitiesCucumber {

}
