package shriramgi.com.testshriram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setup {
	public static  RemoteWebDriver driver;
	public static WebDriverWait wait;
	
	public void Browser(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
}
