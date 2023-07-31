package com.citi.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.citi.base.AutomationWrapper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientSteps  {
	
	private AutomationWrapper wrapper;

	public PatientSteps(AutomationWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@When("I click on patient menu")
	public void i_click_on_patient_menu() {

		wrapper.driver.findElement(By.xpath("//div[text()='Patient']")).click();
	}

	@When("I click on new-search menu")
	public void i_click_on_new_search_menu() {
		wrapper.driver.findElement(By.xpath("//div[text()='New/Search']")).click();
	}

	@When("I fill the new patient form")
	public void i_fill_the_new_patient_form(DataTable dataTable) {

		System.out.println(dataTable);

		List<Map<String, String>> list=dataTable.asMaps();
		
		System.out.println(list.get(0));
		System.out.println(list.get(0).get("firstname"));
		System.out.println(list.get(0).get("lastname"));
		System.out.println(list.get(0).get("gender"));
		System.out.println(list.get(0).get("dob"));
		
		wrapper.driver.switchTo().frame(wrapper.driver.findElement(By.name("pat")));
		wrapper.driver.findElement(By.id("")).sendKeys(list.get(0).get("firstname"));
		
	}

	@When("I click on create new patient")
	public void i_click_on_create_new_patient() {

	}

	@When("I click on confirm create new patient")
	public void i_click_on_confirm_create_new_patient() {

	}

	@When("I handle the alert")
	public void i_handle_the_alert() {

	}

	@When("I close the happy birthday popup if avaiable")
	public void i_close_the_happy_birthday_popup_if_avaiable() {

	}

	@Then("I should be able verify the added name as {string}")
	public void i_should_be_able_verify_the_added_name_as(String string) {

	}
}
