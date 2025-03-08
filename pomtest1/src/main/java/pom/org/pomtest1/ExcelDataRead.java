package pom.org.pomtest1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public void getExcelData() throws IOException {
		String Excel = "";

		FileInputStream file = new FileInputStream(Excel);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheetAt = book.getSheetAt(0);
		XSSFRow headerRow = sheetAt.getRow(0);

		Map<Integer, String> headerMap = new HashMap<>();

		for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {

			String stringCellValue = headerRow.getCell(i).getStringCellValue();
			headerMap.put(i, stringCellValue);

		}

		// loop to get reach cell data
		for (int i = 1; i <= headerRow.getPhysicalNumberOfCells(); i++) {
			XSSFRow row = sheetAt.getRow(i);
?					

		}

	}

}
