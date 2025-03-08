package practice.pom.org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.SeleniumBaseClass;

public class LoginPage extends SeleniumBaseClass {
	
	
	// Locators

	public String getUserNamelabel() {

		return driver.findElement(By.xpath("//input[@id='username']/preceding-sibling::label")).getText();
	}

	public String getpasswordlabel() {
		return driver.findElement(By.xpath("//input[@id='password']/preceding-sibling::label")).getText();
	}
	// Actions

	@FindBy(id = "username")
	public static WebElement enterUserName;

	@FindBy(id = "password")
	public static WebElement enterPassword;
	
	@FindBy(id = "submit")
	public static WebElement clickSubmit;
	


	/*
	 * public LoginPage enterUserName(String userName) {
	 * 
	 * driver.findElement(By.id("username")).sendKeys(userName);
	 * 
	 * return this; }
	 * 
	 * public LoginPage enterPassword(String password) {
	 * driver.findElement(By.id("password")).sendKeys(password); return this; }
	 * 
	 * public LoginPage clickSubmit() { driver.findElement(By.id("submit")).click();
	 * return this; }
	 * 
	 * public LoginPage logindata(String userName, String password) {
	 * enterUserName(userName); enterPassword(password); clickSubmit(); return this;
	 * }
	 */

}
