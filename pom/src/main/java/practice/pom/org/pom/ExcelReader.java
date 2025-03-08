package practice.pom.org.pom;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

	public static String[][] GetExcel() throws IOException {
		String a = "C:\\Users\\gokul\\.eclipse\\Practice\\ExcelRead.xlsx";

		FileInputStream file = new FileInputStream(a);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheetAt = book.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
        int lastCellNum = sheetAt.getRow(0).getLastCellNum();

		System.out.println(lastRowNum);
		System.out.println(lastCellNum);
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			if (row != null) {
				for (int j = 0; j < lastCellNum; j++) {
					XSSFCell cell = row.getCell(j);
					if (cell != null) {
						data[i-1][j] = cell.getStringCellValue();

					} else {
						 data[i-1][j] = "";
					}

				}

			}

		}

		return data;

	}

}
