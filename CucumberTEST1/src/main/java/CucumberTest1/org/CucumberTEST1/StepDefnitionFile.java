package CucumberTest1.org.CucumberTEST1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnitionFile extends DriverInstance{
	
	SoftAssert softAssert = new SoftAssert();

	@Given("User should login to the application")
	public void userShouldLoginToTheApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bookcart.azurewebsites.net/login");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Given("User enter the name as {string}")
	public void userEnterTheNameAsOrtoni(String string) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[formcontrolname='username']")))
				.sendKeys(string);
	}

	@Given("User enter the password as {string}")
	public void userEnterThePasswordAsPass1234(String string) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[formcontrolname='password']")))
				.sendKeys(string);
	}

	@When("user click the submit button")
	public void userClickTheSubmitButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[color='primary']"))).click();

	}

	@Then("Check current page url with actual url")
	public void checkCurrentPageUrlWithActualUrl() {
		// Get the current URL from the browser
		String currentURL = driver.getCurrentUrl();

		// Replace with the actual expected URL
		String expected = "https://bookcart.azurewebsites.net/"; // Put your expected URL here

		// Assert that the actual URL is equal to the expected URL
		softAssert.assertEquals(currentURL, expected, "login passed");
		
	}

	@But("Check Error message")
	public void checkErrorMessage() {
		String text = driver.findElement(By.cssSelector("mat-error[id='mat-mdc-error-12']")).getText();
		String Expected = "Username or Password is incorrect.";
		softAssert.assertEquals(text, Expected, "login should be failed");
		softAssert.assertAll();
	}

}
