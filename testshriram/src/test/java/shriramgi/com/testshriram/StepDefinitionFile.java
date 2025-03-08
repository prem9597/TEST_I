package shriramgi.com.testshriram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionFile extends Setup{
	/*
	 * SoftAssert sftassst = new SoftAssert(); WebDriver driver; LoginPage
	 * loginPage;
	 * 
	 * public StepDefinitionFile(BrowserConfig driver1) { this.driver =
	 * driver1.getWebDriver(); loginPage=new LoginPage(driver); }
	 */

	@Given("User click the login or sign up button")
	public void userClickTheLoginSignUpButton() {

		LoginPage.clickLoginSignBut.click();
		// sftassst.assertEquals(until, true, "Fields is not clickable");
	}

	@Given("User Enter the Name")
	public void userEnterTheName() {
		LoginPage.enteryourName.sendKeys("PREM");

	}

	@Given("Enter the Email")
	public void userEnterTheEmail() {

		LoginPage.enteryourEmail.sendKeys("gokul8premkumar@gmail.com");
	}

	@When("Click the Sign button")
	public void clickTheSignButton() {
		LoginPage.clicksignBtn.click();
	}

	@Then("Login to Signup page")
	public void loginToSignupPage() {

		System.out.println("login in to sign Up page");
	}

}
