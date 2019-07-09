package org.test.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File f1 = new File("C:\\excel\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook data = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = data.getSheetAt(0);
		String excel = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(excel);
		for(int i=0;i<14;i++) {
			String excel1 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(excel1);
			String excel2 = sheet1.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(excel2);
		}
		
		

	}

}
