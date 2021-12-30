package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {

	public static String readData(int row, int column) throws IOException
	{
		File src = new File("C:\\Users\\A\\Desktop\\TestDataSeptBatch.xlsx");
//		To load that particular location in order to perform the action
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Testsheet");
		DataFormatter df = new DataFormatter();
		String stringvalue = df.formatCellValue(sh1.getRow(row).getCell(column));
		
		
		
		return stringvalue;
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
	File src = new File("C:\\Users\\A\\Desktop\\TestDataSeptBatch.xlsx");
//	To load that particular location in order to perform the action
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheet("Testsheet");
	
	String value = sh1.getRow(2).getCell(1).getStringCellValue();
	
	
	System.out.println(value);
	
	DataFormatter df = new DataFormatter();
	String numericstringvalue = df.formatCellValue(sh1.getRow(20).getCell(0));
	System.out.println(numericstringvalue);
	
//	String getintvalue = sh1.getRow(20).getCell(0).getStringCellValue();
//	
//	System.out.println(getintvalue);
	
	writeData();
		
	}
	
	public static void writeData() throws IOException
	{
	File src = new File("C:\\Users\\A\\Desktop\\TestDataSeptBatch.xlsx");
//	To load that particular location in order to perform the action
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheet("Testsheet");
	
	File fout = new File("C:\\Users\\A\\Desktop\\TestDataSeptBatch.xlsx");
	
	FileOutputStream fos = new FileOutputStream(fout);
//	To write for Already available row but not available column
	sh1.getRow(8).createCell(2).setCellValue("Write Test");
//		To write for un available row also not available column
	sh1.createRow(50).createCell(3).setCellValue("Newrow and column");
	
	
//	to save the content
	wb.write(fos);
	
		
	}
	
	
	
}
