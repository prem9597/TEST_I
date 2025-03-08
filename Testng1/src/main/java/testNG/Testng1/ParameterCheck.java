package testNG.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterCheck {
	@Parameters({ "Username", "Password" })
	@Test()

	public static void amazon(String Pass, String name) {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(Pass);
		driver.findElement(By.id("submit")).click();

	}

}
