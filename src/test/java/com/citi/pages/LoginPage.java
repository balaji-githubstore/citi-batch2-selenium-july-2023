package com.citi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By usernameLocator = By.id("authUser");
	private By passwordLocator = By.cssSelector("#clearPass");
	private By loginLocator = By.cssSelector("button[type='submit']");
	private By errorLocator = By.xpath("//p[contains(text(),'Invalid')]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	public void clickOnLogin() {
		driver.findElement(loginLocator).click();
	}

	public String getErrorMessage() {
		return driver.findElement(errorLocator).getText();
	}
}
