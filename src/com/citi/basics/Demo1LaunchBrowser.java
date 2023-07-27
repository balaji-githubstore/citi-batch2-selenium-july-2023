package com.citi.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver obj=new ChromeDriver();
		
		obj.get("https://www.facebook.com/");
		
		//get the title and print it 
		String actualTitle=obj.getTitle();
		System.out.println(actualTitle);
		
		//get the currentUrl and print it 
		String actualUrl=obj.getCurrentUrl();
		System.out.println(actualUrl);
		
		//get the pageSource and print it
		String pageSource=obj.getPageSource();
		System.out.println(pageSource);
		
		obj.quit();
	}

}
