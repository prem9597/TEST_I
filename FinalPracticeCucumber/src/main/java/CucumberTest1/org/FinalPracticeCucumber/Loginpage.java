package CucumberTest1.org.FinalPracticeCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage extends BaseClass {
	
	SoftAssert softAssert = new SoftAssert();
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
	public void errorMessageCheck(){
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mat-mdc-error-0")))
		.getText();
		String expected="Username or Password is incorrect.";
		Assert.assertEquals(text,expected,"Login credentials are inValid" );
	}
}
