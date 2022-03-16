package stepDefinition;

import cucumber.api.java.en.Given;
import utilities.UtilitiesCucumber;

public class CanvasLoginTest extends UtilitiesCucumber {

	@Given("^I go to \"([^\"]*)\" page$")
	public void I_go_to_page(String webPage) {
	    driver.get(webPage);
	}
	
	
	
	
}
