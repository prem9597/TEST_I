package testNG.Testng1;

import org.testng.annotations.Test;

public class groups {
	@Test(groups = {"start"},priority = 1)
	public void login() {
		System.out.println("2 nd Step: login");
	}

	@Test(groups = {"start"},priority = 2)
	public void validData() {
		System.out.println("3rd Step: pass valid data");
	}

	@Test(groups = {"start","end"},priority = 3)
	public void signOut() {
		System.out.println("4rth Step: Sign out");
	}

	@Test(groups = {"end"}, dependsOnMethods = "signOut")
	public void signOut1() {
		System.out.println("5rth Step: Sign out1");
	}
}
