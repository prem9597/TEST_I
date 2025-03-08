package testNG.Testng1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicExcelRead {
	@Test

	public void read() throws IOException {
		// Locate the file location
		String path = "C:\\Users\\gokul\\.eclipse\\Practice\\book1.xlsx";
		// locate the workbook
		XSSFWorkbook book = new XSSFWorkbook(path);
		// locate the page.
		XSSFSheet sheet = book.getSheetAt(0);
		// get row
		XSSFRow row = sheet.getRow(1);
		// get column
		XSSFCell clmn = row.getCell(0);
		XSSFRow row1 = sheet.getRow(1);
		// get column
		XSSFCell clmn1 = row.getCell(1);
		String values = clmn.getStringCellValue();
		String values1 = clmn1.getStringCellValue();
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(data[]);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(values1);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.quit();
	}
}
