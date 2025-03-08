package testNG.Testng1;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test
	void practice() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		SoftAssert refname = new SoftAssert();

		// title Check
		String actualTitle = driver.getTitle();
		String expectedtile = "Test Login | Practice Test Automation";
		refname.assertEquals(actualTitle, expectedtile, "TITLE is mismatched");

		// Url check
		String actualUrl = driver.getCurrentUrl();
		String expectedurl = "https://practicetestautomation.com/practice-test-login/";
		refname.assertEquals(actualUrl, expectedurl, "URL is mismatched");

		String userid = "student";
		String Password = "";

		if ((userid != null & userid.equals("student")) && (Password != null & Password.equals("Password123"))) {
			driver.findElement(By.id("username")).sendKeys(userid);
			driver.findElement(By.id("password")).sendKeys(Password);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

			// Get the Message after login
			String actualmessage = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"))
					.getText();
			String ecpectedMessage = "Logged In Successfully";
			refname.assertSame(actualmessage, ecpectedMessage, "logged successfully");
		}

		else if (userid.equals("student") && Password.isEmpty()) {
			driver.findElement(By.id("username")).sendKeys(userid);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			String actualErrMsg = driver.findElement(By.xpath("(//*[@id=\"login\"])/div[2]")).getText();
			String expectedErrMsg = "Your password is invalid!1";
			refname.assertEquals(actualErrMsg, expectedErrMsg, "login data is mismatched");
		} else if (userid.isEmpty() && !Password.equals("student")) {
			driver.findElement(By.id("password")).sendKeys(Password);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			String actualErrMsg = driver.findElement(By.xpath("(//*[@id=\"login\"])/div[2]")).getText();
			String expectedErrMsg = "Your username is invalid!";
			refname.assertEquals(actualErrMsg, expectedErrMsg, "login data is mismatched");
		} else if (!userid.equals("student") && Password.isEmpty()) {
			driver.findElement(By.id("username")).sendKeys(userid);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			String actualErrMsg = driver.findElement(By.xpath("(//*[@id=\"login\"])/div[2]")).getText();
			String expectedErrMsg = "Your username is invalid!";
			refname.assertEquals(actualErrMsg, expectedErrMsg, "login data is mismatched");
		} else if (!userid.isEmpty() && !Password.equals("student")) {
			driver.findElement(By.id("password")).sendKeys(Password);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			String actualErrMsg = driver.findElement(By.xpath("(//*[@id=\"login\"])/div[2]")).getText();
			String expectedErrMsg = "Your username is invalid!";
			refname.assertEquals(actualErrMsg, expectedErrMsg, "login data is mismatched");
		}

		driver.quit();
		refname.assertAll();
	}
}
