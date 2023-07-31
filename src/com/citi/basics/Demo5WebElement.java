package com.citi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		String actualText=driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		System.out.println(actualText);
		
		String href=driver.findElement(By.partialLinkText("Acknowledgments")).getAttribute("href");
		System.out.println(href);
	}

}
