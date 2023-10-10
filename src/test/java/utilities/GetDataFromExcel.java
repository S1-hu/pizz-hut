package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class GetDataFromExcel {
	
     Constants obj=new Constants();
	
	public static String getUrl() throws IOException
	{
	
		FileInputStream fs=new FileInputStream(Constants.TESTDATA);
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet   =workbook.getSheetAt(0);
		
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		
		Row row1=sheet.getRow(1);
		Cell cell1=row1.getCell(0);
		
		System.out.println(sheet.getRow(1).getCell(0));
		
		XSSFCell value=sheet.getRow(1).getCell(0);
		
		String text=value.toString();
		
		return text;
		
		
	}
	

}
	

