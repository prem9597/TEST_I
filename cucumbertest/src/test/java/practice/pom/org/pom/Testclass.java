package practice.pom.org.pom;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.SeleniumBaseClass;
import testNG.Testng1.dataproviderclass;

public class Testclass extends LoginPage {
	@Test(dataProvider = "data", dataProviderClass = SeleniumBaseClass.class)
	void loginPagedata(String[] data) {

		PageFactory.initElements(driver, LoginPage.class);
		String actualuserlabel = getUserNamelabel();
		String EcpecteduserLabel = "Username";
		SoftAssert acst = new SoftAssert();

		acst.assertEquals(EcpecteduserLabel, actualuserlabel, "Userlabel is incorrect");

		String actualPassLabel = getpasswordlabel();
		String EcpectedPassLabel = "Password";
		acst.assertEquals(EcpectedPassLabel, actualPassLabel, "Password  is incorrect");
		enterUserName.sendKeys(data[0]);
		enterPassword.sendKeys(data[1]);

		clickSubmit.click();

	}

}
