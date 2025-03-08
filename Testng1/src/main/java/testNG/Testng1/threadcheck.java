package testNG.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class threadcheck {

	@Test(invocationCount = 2, threadPoolSize = 2)

	private static void amazon() {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\gokul\\.eclipse\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		/*
		 * WebDriver driver = new ChromeDriver(); driver.get(
		 * "https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_Cj0KCQjwu-63BhC9ARIsAMMTLXQlCLIAQqqIcf85FOEr56eAeY5NWIgjQcJxbuQSLoONCcnJ4G7-j2gaAkeAEALw_wcB_k_"
		 * ); driver.quit();
		 */
	}
//InvalidSelectorException
	@Test(invocationCount = 1, threadPoolSize = 2,expectedExceptions = {Exception.class})
	private static void flipkart() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/big-billion-day-store?param=2793&s_kwcid=AL!739!3!676201929245!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=Cj0KCQjwu-63BhC9ARIsAMMTLXQr6xAfR-NBrFLpuUyAx56mWoz3YFZuuBXIivZI9TYcp5ICMjkRZWcaArjeEALw_wcB");
		driver.findElement(By.xpath("")).click();
		driver.quit();
	}

}
