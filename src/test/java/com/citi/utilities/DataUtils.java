package com.citi.utilities;

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

}
