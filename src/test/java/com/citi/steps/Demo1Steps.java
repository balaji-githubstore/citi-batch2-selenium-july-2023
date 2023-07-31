package com.citi.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps {
	
	@Given("I have browser with OpenEMR application")
	public void i_have_browser_with_open_emr_application() {
	   System.out.println("launch browswer");
	}
	
	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
	    System.out.println(username);
	}
	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
	    System.out.println(password);
	}
	@When("I click on login")
	public void i_click_on_login() {
	    System.out.println("login");
	}
	@Then("I should get access to the portal with title as {string}")
	public void i_should_get_access_to_the_portal_with_title_as(String expectedTitle) {
	    System.out.println("assertion " +expectedTitle);
	}

	@Then("I should not get access to dashboard with error as {string}")
	public void i_should_not_get_access_to_dashboard_with_error_as(String expectedError) {
	    System.out.println("assert error "+expectedError);
	}
}
