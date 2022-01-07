package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
	@DataProvider(name = "testdata")
	public static String[][] dptest() throws IOException
	{
		File src = new File("E:\\Desktop\\VimanNagar\\May 21\\SeptVimanSeleniumBasics\\DPTestSheet.xlsx");
//		To load that particular location in order to perform the action
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		int row = sh1.getLastRowNum();
		System.out.println("Total number of rows are:"+row);// last index number of row
		
		int col = sh1.getRow(0).getLastCellNum();
		
		System.out.println("Total number of column are:"+col);// total number of col
		
		String data[][] = new String[row-1][col];
		
		for(int i=1; i<=row; i++)
		{
			for(int j=0; j<col; j++)
			{
				data[i-1][j]= sh1.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		
		return data;
		
		
	}
	
	
	
	
}
