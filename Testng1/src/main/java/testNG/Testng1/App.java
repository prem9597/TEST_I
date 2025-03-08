package testNG.Testng1;

import org.testng.annotations.Test;

public class App {
	@Test(threadPoolSize = 5)
	public void signUp() {
		System.out.println("First Step: Sign up");
	}

	@Test
	public void login() {
		System.out.println("2 nd Step: login");
	}

	@Test()
	public void validData() {
		System.out.println("3rd Step: pass valid data");
	}

	@Test
	public void signOut() {
		System.out.println("4rth Step: Sign out");
	}
}
