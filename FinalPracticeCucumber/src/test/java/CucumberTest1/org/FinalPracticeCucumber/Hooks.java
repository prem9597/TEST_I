package CucumberTest1.org.FinalPracticeCucumber;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@Before

	public void driverSetup(Scenario scenario) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println("Scenario name : " + scenario.getName());
	}

	@After
	public void TearDown(Scenario scenario) {

		System.out.println("Scenario name : " + scenario.getName());
		System.out.println("Scenario status : " + scenario.getStatus());
		boolean failed = scenario.isFailed();
		if(failed) {
			byte[] sht=driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(sht, "image/png", "screenshot");
		}
		driver.quit();
	}

}
