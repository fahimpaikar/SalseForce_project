package com.SalesForce.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		String filePath = "C:\\Users\\fahim\\eclipse-workspace\\Com.POMwithPageFactory\\TestData.xlsx";
		//String filePath = System.getProperty(("user.dir")+"\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(filePath);
		    // create an object of workbook class
		try {
			XSSFWorkbook  workBook = new XSSFWorkbook(fis);
			// create object of the sheet since one excel workbook can have many sheets
			XSSFSheet sheet = workBook.getSheetAt(0);// 0 is the index of sheet 1 we can use string if we want to use the sheet's name
			// here we are trying to get the total number of rows in the sheet
			int totalRows = sheet.getLastRowNum();
			totalRows = totalRows+1;
			System.out.println(totalRows);
			int totalCell = sheet.getRow(0).getLastCellNum();
			for(int i =1; i<totalRows; i++) {
				for(int j =0; j<totalCell; j++) {
					String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(cellValue);
				}
			}
			workBook.close();
//			
//			String cellValue = sheet.getRow(9).getCell(0).getStringCellValue();
//			System.out.println(cellValue);
//			
			
			
			
			
			
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}
