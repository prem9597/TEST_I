package test.v1.org.practice;

import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

public class WebLaunch {
	
	@Test
	
	void browserLaunch() {
		
		System.setProperty("weebDriver.chrome.driver", "");
		
		WebDriver  driver=new ChromeDrver();
		
		
	}

}
