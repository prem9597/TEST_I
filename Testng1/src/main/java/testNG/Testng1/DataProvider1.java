package testNG.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class DataProvider1  {

	
	@Test(dataProvider = "data",dataProviderClass = dataproviderclass.class)
	public void DataproviderCheck(String name, String pass) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		// Input username and password
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("submit")).click();
		driver.quit();
	}

}
