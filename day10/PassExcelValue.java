package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PassExcelValue {

	@Test
	public static String[][] readExcel() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("D:\\TestLeaf\\Selenium\\src\\main\\java\\week6\\day1\\Data\\TestData.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0); //We use Index because we have only one sheet
		//If we have multiple sheets, use getSheet(sheetname)
		
		//XSSFRow row = sheet.getRow(1); -->Excluding Header
		//XSSFCell cell = row.getCell(0); -->Get Cell Value
		
		
		//Method to get last row count
		int RowCount = sheet.getLastRowNum();
		
		//No direct method to get last Column
		int ColumnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[RowCount][ColumnCount];
		
		for (int i = 1;  i <= RowCount; i++) {		 //since first row is header i=1
			XSSFRow row = sheet.getRow(i);  //Iterates through each row
			for (int j = 0; j < ColumnCount; j++) {    //since row starts from one, we need values from cell index 0 so j=0
				String value = row.getCell(j).getStringCellValue();
				System.out.println(value);
				data[i-1][j] = value;  //Since i = 1 but we need data from 0 to pass to TC, so i-1
			}
		}
		return data;
		

	}

}
