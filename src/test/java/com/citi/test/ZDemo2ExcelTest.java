package com.citi.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * will be deleted later
 */
public class ZDemo2ExcelTest {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file=new FileInputStream("test_data/OpenEMRData.xlsx"); 
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("validLoginTest");
		
		String value= sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		//try to write the logic to print all cell value
		
		book.close();
		file.close();
		
		
		
		
	}
}
