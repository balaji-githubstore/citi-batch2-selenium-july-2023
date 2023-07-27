package com.citi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
//		By loc=By.id("email");
//		WebElement ele= driver.findElement(loc);
//		ele.sendKeys("helo");
		
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("helo");
		
		//driver.findElement(By.id("email")).sendKeys("dmoe12345@gmail.com");
		
		//enter password as welcome123
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		//click on login
		driver.findElement(By.name("login")).click();
		
		
	}

}
