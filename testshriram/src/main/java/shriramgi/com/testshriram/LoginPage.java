package shriramgi.com.testshriram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	BrowserConfig driver;

	public LoginPage(BrowserConfig driver) {
		this.driver = driver;
	}

	// Locator
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/i[1]")
	public WebElement clickLoginSignBut;

	@FindBy(name = "name")
	public WebElement enteryourName;
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
	public WebElement enteryourEmail;
	@FindBy(name = "email")
	public WebElement enteryourEmailAddr;
	@FindBy(name = "password")
	public WebElement enteryourPassword;
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")
	public WebElement clickLoginBtn;
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")
	public WebElement clicksignBtn;
	

}
