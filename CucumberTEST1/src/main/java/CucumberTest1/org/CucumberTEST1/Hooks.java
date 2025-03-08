package CucumberTest1.org.CucumberTEST1;

import java.io.File;
import java.time.LocalDateTime;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends DriverInstance {
	@Before
	public void beforeMethod(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("Scenario Name is:" + name);
		scenario.log(LocalDateTime.now().toString());
		scenario.log("Scenario ID is"+scenario.getId());
		System.out.println("Scenario ID is"+scenario.getId());
		System.out.println("Scenario line is"+scenario.getLine());
		System.out.println("Scenario status is"+scenario.getStatus());
		
		System.out.println("URI"+scenario.getUri());
		System.out.println("source"+scenario.getSourceTagNames());
		
	};

	@BeforeStep
	public void beforeStep(Scenario scenario) {

	}

	@AfterStep
	public void afterStep(Scenario scenario) {

	}
 
	@After
	public void afterMethod(Scenario scenario) {
		boolean failed = scenario.isFailed();

		LocalDateTime now = LocalDateTime.now();
		String string = now.toString();
		scenario.log(string);
		if (failed) {
			TakesScreenshot sht = (TakesScreenshot) driver;
			byte[] screenshotAs = sht.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "screenshot");

		}
		System.out.println("Scenario status is"+scenario.getStatus());
		
		driver.quit();
	}
}
