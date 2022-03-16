package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {


	@Given("I open the browser")
	public void i_open_the_browser() {
	   System.out.println("I Open the browser");
	}
	@Given("I visit the application")
	public void i_visit_the_application() {
		System.out.println("I Visit the application");
	}
	@When("I enter username")
	public void i_enter_username() {
		System.out.println("I enter username");
	}
	@When("I enter password")
	public void i_enter_password() {
		System.out.println("I enter the password");
	}
	@When("I click the login button")
	public void i_click_the_login_button() {
		System.out.println("I click login button");
	}
	@Then("I should see the dashboard page")
	public void i_should_see_the_dashboard_page() {
		System.out.println("I should see dashboard page");
	}
	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("I then check bor more outcome");
	}
	


	@Then("I should not check more outcomes")
	public void i_should_not_check_more_outcomes() {
	   Assert.assertTrue(false);
	}






}
