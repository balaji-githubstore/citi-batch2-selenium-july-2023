package com.citi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete 

		//click on create new account 
		driver.findElement(By.linkText("Create new account")).click(); //check for presence of element in 0.5s 
		
		//enter firstname as saul
		driver.findElement(By.name("firstname")).sendKeys("saul");
		//enter lastname as goodman
		driver.findElement(By.name("lastname")).sendKeys("goodman");
		//enter password as welcome123
		driver.findElement(By.name("reg_passwd__")).sendKeys("saul");
		
		//20 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		
		//select year as 2000
		
		//Click on radio button - Custom
		//driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//click on submit
		driver.findElement(By.name("websubmit")).click();
	}

}
