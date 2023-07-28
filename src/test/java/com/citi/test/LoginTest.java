package com.citi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;
import com.citi.utilities.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "validLoginData",dataProviderClass = DataUtils.class)
	public void validLoginTest(String username, String password, String expectedTitle) {
		driver.findElement(By.id("authUser")).sendKeys(username);
		driver.findElement(By.cssSelector("#clearPass")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
}
