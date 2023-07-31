package com.citi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public String[][] validLoginData() {
		String[][] data = new String[2][3];

		data[0][0] = "admin";
		data[0][1] = "pass";
		data[0][2] = "OpenEMR";

		data[1][0] = "physician";
		data[1][1] = "physician";
		data[1][2] = "OpenEMR";

		return data;
	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException
	{
		//currentTestMethodName is the sheetname 
		String currentTestMethodName=method.getName();
		
		Object[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("test_data/OpenEMRData.xlsx", currentTestMethodName);
		return data;
	}

}
