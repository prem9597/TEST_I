package testNG.Testng1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelReadOpearation {
	@Test

	public void Masscode() throws IOException, InterruptedException {
		String path = "C:\\Users\\gokul\\.eclipse\\Practice\\book1.xlsx";
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		// locate the workbook
		XSSFWorkbook book = new XSSFWorkbook(path);

		// locate the sheet
		XSSFSheet sheet = book.getSheetAt(0);

		// Get Row and cell values Using for loop

		for (int i = 1; i < sheet.getLastRowNum(); i++) {

			XSSFRow row = sheet.getRow(i);

			if (row == null)
				continue;// Skip the emppty rows.

			String Userid = null;
			String Password = null;
			

			for (int j = 0; j < row.getLastCellNum(); j++) {

				XSSFCell cell = row.getCell(j);
				if (cell != null && row != null)

				{
					if (j == 0) {
						Userid = cell.getStringCellValue();
					}
					if (j == 1) {
						Password = cell.getStringCellValue();
					}
				}

			}
			if (Userid != null && Password != null) {

				driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(Userid);
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);

				driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();

			}

		}
	}

}
