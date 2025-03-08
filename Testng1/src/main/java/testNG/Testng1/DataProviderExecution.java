package testNG.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderExecution {

	@Test(dataProvider = "PREM",dataProviderClass = DataprovoderPracc1.class)
	void dataexe(String[] data) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/"); //

		driver.findElement(By.id("username")).sendKeys(data[0]);
		driver.findElement(By.id("password")).sendKeys(data[1]);
	
	}
}
