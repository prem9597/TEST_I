package pom.org.pomtest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static RemoteWebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";

	@BeforeMethod
	public void chromeSetUp() {

		driver = new ChromeDriver();
		driver.get(url);

	}

	@AfterMethod
	public void Close() {
		driver.quit();
	}

}
