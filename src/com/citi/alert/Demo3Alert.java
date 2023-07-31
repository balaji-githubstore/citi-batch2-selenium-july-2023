package com.citi.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo3Alert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://nasscom.in/nasscom-membership");
		//click on calculate fee
		driver.findElement(By.id("calculate-fee")).click();
        
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		
		String actualAlertText=driver.switchTo().alert().getText();
		System.out.println(actualAlertText);

		driver.switchTo().alert().accept();
	}
}
