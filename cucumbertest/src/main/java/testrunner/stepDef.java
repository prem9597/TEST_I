package testrunner;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef {

	 WebDriver driver;

		/*
		 * @Given("User navigate to login page") public void iEnterToLoginPage() {
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.get("https://www.saucedemo.com/"); }
		 */

	@Given("I enter the user name as {string}")
	public void iEnterTheUserNameWithInvalidData(String string) {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(string);
	}

	@Given("I enter the password as {string}")
	public void iEnterThePasswordWithInvalidData(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}
	

	/*
	 * @When("I click the submit button") public void iClickTheSubmitButton() {
	 * driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); }
	 */

	@Then("the page redirects to the new page with an error message")
	public void thePageRedirectsToTheNewPageWithAnErrorMessage() {

		// Perform any validation for error message here
		driver.quit();
	}

	/*
	 * @Given("I enter the user name with invalid data") public void
	 * iEnterTheUserNameWithInvalidData() {
	 * driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(
	 * "standcvard_user"); }
	 * 
	 * @Given("I enter the password with invalid data") public void
	 * iEnterThePasswordWithInvalidData() {
	 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(
	 * "secret_xcvxvsauce"); }
	 * 
	 * 
	 * @When("I click tthe submit button") public void iClickTheSubmitButton1() {
	 * driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); }
	 */

	@But("system should throw the error message")
	public void systemShouldThrowTheErrorMessage() {

		driver.quit();
	}

	
}
