package testNG.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamPractice {
	RemoteWebDriver driver;

	@Parameters({ "username", "Password", "browser" })
	@Test
	void ParamTest(String name, String Pass, String browserName) {

		switch (browserName) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			driver = new ChromeDriver();

			break;
		case "edge":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\gokul\\.eclipse\\driver\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		}

		driver.get("https://practicetestautomation.com/practice-test-login/"); //

		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(Pass);
		driver.findElement(By.id("submit")).click();

	}

}
