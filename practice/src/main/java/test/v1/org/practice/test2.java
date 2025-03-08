package test.v1.org.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {

	@Test
	@Parameters({ "PREM", "PRABHA" })

	void test1(String name, String love) {

		System.out.println(name + love);
	}

}
