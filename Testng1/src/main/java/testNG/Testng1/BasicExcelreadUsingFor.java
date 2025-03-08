package testNG.Testng1;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicExcelreadUsingFor {
	/*
	 * @Test public void read() throws IOException { // Locate the file location
	 * String path = "C:\\Users\\gokul\\.eclipse\\Practice\\book1.xlsx";
	 * System.setProperty("Webdriver.chrome.driver",
	 * "C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
	 * ); ChromeDriver driver = new ChromeDriver();
	 * driver.get("https://www.saucedemo.com/v1/"); // locate the workbook
	 * XSSFWorkbook book = new XSSFWorkbook(path); // locate the page. XSSFSheet
	 * sheet = book.getSheetAt(0);
	 * 
	 * LOOP: for (int i = 1; i < 6; i++) { for (int j = 0; j < 2; j++) { XSSFRow row
	 * = sheet.getRow(i); // get column XSSFCell cell = row.getCell(j); String
	 * values = cell.getStringCellValue();
	 * driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(values);
	 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(values);
	 * driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); CellType
	 * blank = cell.getCellType().BLANK; break LOOP;
	 * 
	 * } }
	 * 
	 * book.close(); driver.quit(); }
	 */

	@Test

	public void Masscode() throws IOException, InterruptedException {
		String path = "C:\\Users\\gokul\\.eclipse\\Practice\\book1.xlsx";
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		// locate the workbook
		XSSFWorkbook book = new XSSFWorkbook(path);
		// locate the page.
		XSSFSheet sheet = book.getSheetAt(0);

		Loop: for (int i = 1; i < sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);

			if (row == null)
				continue; // skip the particular condition

			String UserId = null;
			String Password = null;

			for (int j = 0; j < row.getLastCellNum(); j++) {

				XSSFCell cell = row.getCell(j);
				if (cell != null && cell.getCellType() == CellType.STRING) {
					if (j == 0) {
						UserId = cell.getStringCellValue();

					}
					if (j == 1) {
						Password = cell.getStringCellValue();
					}
				}
			}

			if (UserId != null && Password != null) {

				driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(UserId);
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
				driver.close();

			}
		}

	}

}
