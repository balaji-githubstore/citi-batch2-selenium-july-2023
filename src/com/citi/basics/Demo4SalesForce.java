package com.citi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4SalesForce {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");

		// enter firstname as john
		driver.findElement(By.name("UserFirstName")).sendKeys("john");
		driver.findElement(By.xpath("//input[contains(@id,'UserLast')]")).sendKeys("wick");

		// Select Country as United Kingdom
		Select selectCountry = new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByValue("GB");

		// select job title as IT Manager
		Select selectJobTitle = new Select(driver.findElement(By.name("UserTitle")));
		selectJobTitle.selectByVisibleText("IT Manager");

		// click checkbox --> T&C
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

	}

}
