package test.v1.org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test12 {

	public static  WebDriver driver ;

    @BeforeClass
    public static WebDriver setup() {
        // Set up WebDriver
       // System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        return driver;
    }
	/*
	 * @Test static void browserLaunch() throws InterruptedException, AWTException {
	 * 
	 * 
	 * Robot ref = new Robot(); WebElement drag =
	 * driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	 * 
	 * ref.keyPress(KeyEvent.VK_A); ref.keyRelease(KeyEvent.VK_A);
	 * 
	 * 
	 * WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	 * WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	 * String dropname =
	 * driver.findElement(By.xpath("//*[@id=\"droppable\"]/child::p/b")).getText();
	 * System.out.println(dropname);
	 * 
	 * Actions act = new Actions(driver); act.dragAndDrop(drag, drop).perform();
	 * String dropname1 =
	 * driver.findElement(By.xpath("//*[@id=\"droppable\"]/child::p/b")).getText();
	 * 
	 * System.out.println(dropname1);
	 * 
	 * WebElement mosover =
	 * (driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button")));
	 * act.moveToElement(mosover).perform();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * WebElement mosover2 =
	 * (driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]"))); WebElement
	 * mosover3 =
	 * (driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/div")));
	 * 
	 * act.moveToElement(mosover2).moveToElement(mosover3).click().perform();
	 * 
	 * 
	 * }
	 */
}