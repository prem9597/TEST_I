package shriramgi.com.testshriram;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	BrowserConfig driver;

	public Hooks(BrowserConfig driver) {
		this.driver = driver;
	}

	@Before
	public void BeforeSbenarios(Scenario ref) {

		System.out.println(ref.getName());
		System.out.println(ref.getId());
		System.out.println(ref.isFailed());
		System.out.println(ref.getStatus());
		ref.log(LocalDateTime.now().toString());

	}

	@After
	public void AfterSbenarios(Scenario ref) {
		System.out.println(ref.getName());
		System.out.println(ref.getId());
		System.out.println(ref.isFailed());
		ref.log(LocalDateTime.now().toString());

	}

}
