package pom.org.pomtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionClass extends BaseClass {

//locators
	public String getUserNamelabel() {

		return driver.findElement(By.xpath("//input[@id='username']/preceding-sibling::label")).getText();
	}

	public String getpasswordlabel() {
		return driver.findElement(By.xpath("//input[@id='password']/preceding-sibling::label")).getText();
	}

//Actions

	//@FindBy(id = "username")
	public static WebElement username;

	//@FindBy(id = "password")
	public static WebElement password;
	//@FindBy(id = "submit")
	public static WebElement submit;

	/*
	 * public ActionClass getUserName(String username) {
	 * 
	 * driver.findElement(By.id("username")).sendKeys(username);; return this; }
	 * 
	 * public ActionClass getPassWord(String Password) {
	 * 
	 * driver.findElement(By.id("password")).sendKeys(Password);; return this; }
	 * 
	 * public ActionClass clickSubmit() {
	 * 
	 * driver.findElement(By.id("submit")).click();; return this; }
	 */
}
