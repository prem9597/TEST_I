package test.v1.org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class table {

	@Test
	void test1() throws AWTException, InterruptedException, IOException {

		WebDriver driver = table2.getChromeDriver();
		driver.get("https://letcode.in/waits");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='accept']")));
		until.click();

		table2.getScreensct("beforeALert");

		Alert until2 = wait.until(ExpectedConditions.alertIsPresent());
		until2.accept();
		table2.getScreensct("AfterAlert");
		driver.quit();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * List<WebElement> element =
		 * driver.findElements(By.xpath("//*[@id=\"cdk-drop-list-0\"]"));
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		 * 
		 * Wait<WebDriver> wait1 = new FluentWait<>(driver)
		 * .withTimeout(Duration.ofSeconds(10))
		 * .pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
		 * 
		 * List<WebElement> element1 =
		 * driver.findElements(By.xpath("//*[@id=\"cdk-drop-list-1\"]")); Actions ref =
		 * new Actions(driver);
		 * 
		 * for (int i = 1; i < element.size(); i++) { String a =
		 * "//div[@id='cdk-drop-list-0']/div[" + i + "]"; WebElement firstSet =
		 * driver.findElement(By.xpath(a)); String value1 = firstSet.getText(); for (int
		 * j = 1; i < element1.size()+element.size(); j++) { String B =
		 * "//div[@id='cdk-drop-list-0']/div[" + j + "]"; WebElement sendtSet =
		 * driver.findElement(By.xpath(B));
		 * 
		 * ref.dragAndDrop(firstSet, sendtSet).perform();
		 * 
		 * } }
		 * 
		 * 
		 * System.out.println(element.isEnabled());
		 * System.out.println(element.isSelected()); element.click();
		 * System.out.println(element.isSelected());
		 * 
		 * WebElement element1 = driver .findElement(By.
		 * xpath("//label[text()='Find which one is selected']/following::input[2]"));
		 * System.out.println(element1.isEnabled());
		 * System.out.println(element1.isSelected()); element1.click();
		 * 
		 * 
		 * WebElement element = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
		 * driver.switchTo().frame(element);
		 * driver.findElement(By.name("fname")).sendKeys("PREMKUMAR");
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input"))
		 * .sendKeys("drgdrytdfgdfgdfg");
		 * 
		 * driver.switchTo().frame(1); driver.findElement(By.xpath(
		 * "/html/body/app-root/app-innerframe/div/div/div/div/div/input"))
		 * .sendKeys("gokul8prem@gmail.com");
		 * 
		 * driver.switchTo().defaultContent(); WebElement element2 =
		 * driver.findElement(By.xpath(""));
		 * 
		 * 
		 * driver.findElement(By.name("fname")).clear();
		 * driver.findElement(By.name("fname")).sendKeys("PRABH");
		 * 
		 * Select ref = new Select(element); System.out.println(ref.isMultiple());
		 * ref.selectByValue("2");
		 * 
		 * // ref.selectByIndex(2);
		 * 
		 * ref.selectByVisibleText("Pine Apple");
		 * 
		 * WebElement firstSelectedOption = ref.getFirstSelectedOption();
		 * 
		 * System.out.println(firstSelectedOption.getText());
		 * 
		 * WebElement element2 =
		 * driver.findElement(By.xpath("//select[@id='superheros']")); Select ref1 = new
		 * Select(element2); System.out.println(ref1.isMultiple());
		 * ref1.selectByValue("am"); ref1.selectByValue("aq"); List<WebElement> options
		 * = ref1.getOptions(); options.add(0,element2);
		 * 
		 * List<WebElement> allSelectedOptions = ref1.getAllSelectedOptions(); for
		 * (WebElement x : allSelectedOptions) { System.out.println(x.getText());
		 * 
		 * }
		 * 
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		 * 
		 * String Parentid = driver.getWindowHandle();
		 * 
		 * System.out.println(Parentid);
		 * 
		 * Set<String> allids = driver.getWindowHandles();
		 * 
		 * System.out.println(allids);
		 * 
		 * List<String> id = new LinkedList<String>(allids);
		 * 
		 * for (String avs : id) {
		 * 
		 * driver.switchTo().window(avs); System.out.println(driver.getTitle());
		 * driver.close(); }
		 * 
		 * 
		 * List<WebElement> header =
		 * table.findElements(By.xpath("//*[@id=\"example\"]/child::thead"));
		 * 
		 * for (WebElement Hrd : header) {
		 * 
		 * List<WebElement> celldata =
		 * Hrd.findElements(By.xpath("//*[@id=\"example\"]/child::tbody/tr/td"));
		 * 
		 * for (WebElement data : celldata) {
		 * 
		 * if (data.getText().equalsIgnoreCase("Airi Satou")) {
		 * System.out.println(celldata.size());
		 * 
		 * } } }
		 * 
		 */
	}

}
