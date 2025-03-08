package pom.org.pomtest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@SuppressWarnings("unused")
public class TestClass extends ActionClass {

	@Test
	void executeTC1() {

		/*
		 * String getpasswordlabel = ref.getpasswordlabel(); String a =
		 * "FDGFDGDFGdsfsdfsdfsdfsdf"; ast.assertEquals(a, getpasswordlabel,
		 * "FDGDFGDGDG"); String getpasswordlabel2 = ref.getpasswordlabel(); String b =
		 * "FDGFDGDFGdsfsdfsdfsdfsdf";
		 * 
		 * ast.assertEquals(b, getpasswordlabel2, "FDGDFGDGDfgggggg]
		 * );
		 */
		PageFactory.initElements(driver, ActionClass.class);
		username.sendKeys("student");
		password.sendKeys("Password123");
		submit.click();
		System.out.println("PREM JI PRABHA ");

	}

}
