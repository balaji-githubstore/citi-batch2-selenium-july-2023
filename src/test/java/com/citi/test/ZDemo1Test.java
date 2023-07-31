package com.citi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 * will be deleted later
 */
public class ZDemo1Test {
	
	@DataProvider
	public Object[][] validData()
	{
		Object[][] data=new Object[3][2];
		//i--> number of test case
		//j--> number of arguments/parameters
		data[0][0]=8787;
		data[0][1]="saul123";
		
		data[1][0]="kim";
		data[1][1]="kim123";
		
		data[2][0]="ken";
		data[2][1]="ken123";
		
		return data;
	}
	
	@Test(dataProvider = "validData")
	public void validLoginTest(String username,String password)
	{
		System.out.println("Login"+username+password);
	}

}
