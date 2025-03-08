package shriramgi.com.testshriram;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserConfig {
	private RemoteWebDriver driver;
	private WebDriverWait wait;

	// Initializes the WebDriver
	public void setWebDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}

	// Initializes WebDriverWait with a timeout
	public void setWebDriverWait() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Returns the current WebDriver
	public WebDriver getWebDriver() {
		return driver;
	}

	// Returns the current WebDriverWait
	public WebDriverWait getWebDriverWait() {
		return wait;
	}

	/*
	 * // Optional: Allows updating the WebDriver public void setDriver(WebDriver
	 * driver) { this.driver = driver; }
	 * 
	 * // Optional: Allows updating the WebDriverWait public void
	 * setWait(WebDriverWait wait) { this.wait = wait; }
	 */
}
