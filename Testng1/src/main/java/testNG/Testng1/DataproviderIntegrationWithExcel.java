package testNG.Testng1;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DataproviderIntegrationWithExcel {

	
	
	public static void  main(String[] org) throws IOException {

		String excelfile = "C:\\Users\\gokul\\.eclipse\\Practice\\book1.xlsx";

		XSSFWorkbook wbook = new XSSFWorkbook(excelfile);

		XSSFSheet Sheet = wbook.getSheetAt(0);

		XSSFRow row = Sheet.getRow(1);

		XSSFCell cell = row.getCell(1);

		System.out.println(cell.getStringCellValue());

		
		  String path = "C:\\Users\\gokul\\.eclipse\\Practice\\book1.xlsx"; // locate
		  the workbook XSSFWorkbook book = new XSSFWorkbook(path); // locate the sheet
		  XSSFSheet sheet = book.getSheetAt(0); // Get Row and cell values Using for
		   String[][] data = new
		  String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		  
		  for (int i = 1; i < sheet.getLastRowNum(); i++) { XSSFRow row =
		  sheet.getRow(i); if (row == null) continue;// Skip the empty rows.
		  
		  for (int j = 0; j < row.getLastCellNum(); j++) { XSSFCell cell =
		  row.getCell(j);
		  
		  if (cell != null && row != null && cell.getCellType() == CellType.STRING) {
		  DataFormatter dft = new DataFormatter(); String values =
		  dft.formatCellValue(cell); data[i - 1][j] = values; }
		  
		  }
		  
		  } return data;
		 
	}

}
