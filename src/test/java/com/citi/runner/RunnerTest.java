package com.citi.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features = {"src/test/resources/feature/login.feature","src/test/resources/feature/patient.feature"}
		features = {"src/test/resources/feature/"}
		
		,glue = {"com.citi.steps","com.citi.base"}
		//,dryRun = true
		,publish = false
		,plugin = {"pretty","html:target/cucumber-report.html"}
		,tags = "@patient"
		)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
