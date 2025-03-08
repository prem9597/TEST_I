package testrunner;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef1 {

	 WebDriver driver;
	WebDriverWait wait;

	// Setup WebDriver and WebDriverWait

	@Given("User navigate to login page")
	public void iEnterToLoginPage() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}

	@Given("user should enter their {string} and {string}")
	public void userShouldEnterTheirAnd(String username, String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys(username);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys(password);
	}

	@Given("I click the submit button")
	public void iClickTheSubmitButton() {
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

	@When("user should handle the alert")
	public void userShouldHandleTheAlert() {
		try {
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
		} catch (Exception e) {
			System.out.println("No alert present or failed to handle the alert: " + e.getMessage());
		}
	}

	@Then("user should add the {string} they want")
	public void userShouldAddTheTheyWant(String item) {
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		for (WebElement element : elements) {
			String text = element.getText();
			System.out.println(text); // Print out the inventory item text (for debugging)
		}
	}

	
}
