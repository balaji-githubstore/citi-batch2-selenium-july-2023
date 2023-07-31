package com.citi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {

	@Test(groups = {"UI","smoke"})
	public void TitleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}

	@Test(groups = {"UI"})
	public void appDescriptionTest() {
		String actualDesc = driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		Assert.assertEquals(actualDesc,
				"The most popular open-source Electronic Health Record and Medical Practice Management solution.");
	}

}
