package test.v1.org.practice;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class alerts {
	@Test
	void test1() throws InterruptedException, AWTException {
		WebDriver driver = test12.setup();

		// Thread.sleep(2000);
		WebElement simple = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		System.out.println(simple.getText());
		simple.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		System.out.println(confirm.getText());
		confirm.click();

		alert.dismiss();
		WebElement Prompt = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		System.out.println(Prompt.getText());

		Actions ref = new Actions(driver);
		ref.click(Prompt).sendKeys("dxfxdfdsfsdfsdf").perform();
		alert.accept();

	}
}
