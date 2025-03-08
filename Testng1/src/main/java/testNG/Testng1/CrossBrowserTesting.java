/*
 * package testNG.Testng1;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.remote.RemoteWebDriver; import
 * org.testng.annotations.Optional; import org.testng.annotations.Parameters;
 * import org.testng.annotations.Test;
 * 
 * public class crossbrwTesting {
 * 
 * RemoteWebDriver driver;
 * 
 * @Parameters({ "Username", "Password", "browser" })
 * 
 * @Test()
 * 
 * public void amazon(String Pass, String name, @Optional String browser) {
 * 
 * switch (browser) { case "chrome":
 * 
 * System.setProperty("WebDriver.chrome.driver",
 * "C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
 * );
 * 
 * driver = new ChromeDriver(); break; case "gecko":
 * System.setProperty("webdriver.gecko.driver",
 * "C:\\Users\\gokul\\.eclipse\\driver\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe"
 * );
 * 
 * driver = new FirefoxDriver(); break;
 * 
 * default: System.out.println("Hi PREM"); break; }
 * 
 * driver.get("https://practicetestautomation.com/practice-test-login/");
 * 
 * driver.findElement(By.id("username")).sendKeys(name);
 * driver.findElement(By.id("password")).sendKeys(Pass);
 * driver.findElement(By.id("submit")).click();
 * 
 * }
 * 
 * }
 */

package testNG.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

    RemoteWebDriver driver;

    @Parameters({ "Username", "Password", "browser" })
    @Test
    public void amazon(String Pass, String name, @Optional String browser) {
        // Default to Chrome if no browser specified
        if (browser == null || browser.isEmpty()) {
            browser = "chrome";
        }

        // Set up the WebDriver based on the specified browser
        switch (browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", 
                        "C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
            case "gecko":
                System.setProperty("webdriver.gecko.driver", 
                        "C:\\Users\\gokul\\.eclipse\\driver\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Browser not supported. Defaulting to Chrome.");
                System.setProperty("webdriver.chrome.driver", 
                        "C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }

        try {
            // Navigate to the login page
            driver.get("https://practicetestautomation.com/practice-test-login/");
            // Input username and password
            driver.findElement(By.id("username")).sendKeys(name);
            driver.findElement(By.id("password")).sendKeys(Pass);
            driver.findElement(By.id("submit")).click();

            // Add any verification or assertion code here...

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
