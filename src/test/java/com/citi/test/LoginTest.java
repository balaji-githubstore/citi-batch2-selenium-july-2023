package com.citi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;
import com.citi.pages.LoginPage;
import com.citi.pages.MainPage;
import com.citi.utilities.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "commonDataProvider", dataProviderClass = DataUtils.class, groups = { "login", "smoke" })
	public void validLoginTest(String username, String password, String expectedTitle) {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		MainPage mainPage=new MainPage(driver);
		Assert.assertEquals(mainPage.getMainPageTitle(), expectedTitle);
	}

	@Test(dataProvider = "commonDataProvider", dataProviderClass = DataUtils.class, groups = { "login" })
	public void invalidLoginTest(String username, String password, String expectedError) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		// assert the error
		String actualError = loginPage.getErrorMessage();
		Assert.assertTrue(actualError.contains("Invalid username or password")); // expects true
	}
}
