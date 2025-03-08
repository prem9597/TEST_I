package test.v1.org.practice;

import org.testng.annotations.Test;

public class test1 {

	@Test()

	void first() {

		System.out.println("1 st method");

	}

	@Test(priority = 1)
	void second() {
		System.out.println("2 nd method");
	}

	@Test(dependsOnMethods = "first" ,priority = -2)
	void third() {
		System.out.println("3 rd method");
	}

}
