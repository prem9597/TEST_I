package test.v1.org.practice;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class table2 {

	public static WebDriver driver;
	public static Actions act;

	@BeforeClass
	public static WebDriver getChromeDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		driver = new ChromeDriver(options);

		return driver;
	}

	public static Actions getAction() {

		act = new Actions(driver);

		return act;
	}

	public static TargetLocator winHndl() {

		TargetLocator window = driver.switchTo();
		return window;
	}

	public static void getScreensct(String FineName) throws IOException {
		TakesScreenshot scrSht = (TakesScreenshot) driver;
		File defaultLcn = scrSht.getScreenshotAs(OutputType.FILE);
		File desiredLcn = new File("C:\\Users\\gokul\\.eclipse\\Practice\\img\\" + FineName+ System.currentTimeMillis() + ".png");
		FileUtils.copyFile(defaultLcn, desiredLcn);
	}

}
