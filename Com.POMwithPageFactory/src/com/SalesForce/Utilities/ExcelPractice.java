package com.SalesForce.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {

	public static void main (String[] args) throws IOException {
		
		String data = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		
		FileInputStream fis = new FileInputStream(data);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int totalRows = sheet.getLastRowNum();
		totalRows= totalRows+1;
		
		int totalColumns = sheet.getRow(0).getLastCellNum();
		System.out.println(totalColumns);
		
		for (int i=1; i< totalRows;i++) {
			for (int j=0; j<totalColumns; j++) {
				String value= sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		
	
	}
	
	
}
