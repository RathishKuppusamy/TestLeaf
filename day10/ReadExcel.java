package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("D:\\TestLeaf\\Selenium\\src\\main\\java\\week6\\day1\\Data\\TestData.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0); //We use Index because we have only one sheet
		//If we have multiple sheets, use getSheet(sheetname)
		
		//XSSFRow row = sheet.getRow(1); -->Excluding Header
		//XSSFCell cell = row.getCell(0); -->Get Cell Value
		
		
		//Method to get last row count
		int RowCount = sheet.getLastRowNum();
		
		//No direct method to get last Column
		int ColumnCount = sheet.getRow(0).getLastCellNum();
		
		for (int i = 1;  i <= RowCount; i++) {		 //since first row is header i=1
			XSSFRow row = sheet.getRow(i);  //Iterates through each row
			for (int j = 0; j < ColumnCount; j++) {    //since row starts from one, we need values from cell index 0 so j=0
				String value = row.getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		

	}

}
