package testNG.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntegrationFinalOutput {

	@Test(dataProvider = "dataset", dataProviderClass = DataproviderIntegrationWithExcel1.class)
	void output(String data[]) {
		
		System.out.println(data[0]);
		/*
		 * System.setProperty("Webdriver.chrome.driver",
		 * "C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
		 * ); ChromeDriver driver = new ChromeDriver();
		 * driver.get("https://www.saucedemo.com/v1/");
		 * driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(data[0]);
		 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(data[1]);
		 * driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		 * driver.quit();
		 */
	}

}
