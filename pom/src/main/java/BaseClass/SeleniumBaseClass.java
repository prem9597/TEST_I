package BaseClass;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import practice.pom.org.pom.ExcelReader;

public class SeleniumBaseClass {

	public static RemoteWebDriver driver = null;
	String URL = "https://practicetestautomation.com/practice-test-login/";

	@BeforeMethod
	public void openApp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);

	}

	@DataProvider(name="data")

	public String[][] Dataprovider() throws IOException {
		String[][] getExcel = ExcelReader.GetExcel();
	
		return getExcel;
	}

	@AfterSuite
	public void closeSetUp() {
		driver.quit();
	}

}
