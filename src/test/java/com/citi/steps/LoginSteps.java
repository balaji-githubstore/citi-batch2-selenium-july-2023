package com.citi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.citi.base.AutomationWrapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given("I have browser with OpenEMR application")
	public void i_have_browser_with_open_emr_application() {
		AutomationWrapper.driver = new ChromeDriver();
		AutomationWrapper.driver.manage().window().maximize();
		AutomationWrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		AutomationWrapper.driver.get("http://demo.openemr.io/b/openemr/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		AutomationWrapper.driver.findElement(By.id("authUser")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		AutomationWrapper.driver.findElement(By.cssSelector("#clearPass")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		AutomationWrapper.driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Then("I should get access to the portal with title as {string}")
	public void i_should_get_access_to_the_portal_with_title_as(String expectedTitle) {
		Assert.assertEquals(AutomationWrapper.driver.getTitle(), expectedTitle);
	}

	@Then("I should not get access to dashboard with error as {string}")
	public void i_should_not_get_access_to_dashboard_with_error_as(String expectedError) {
		String actualError=AutomationWrapper.driver.findElement(By.xpath("//p[contains(text(),'Invalid')]")).getText();
		Assert.assertTrue(actualError.contains("Invalid username or password")); 
	}
}