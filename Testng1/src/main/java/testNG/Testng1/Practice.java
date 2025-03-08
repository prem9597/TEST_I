package testNG.Testng1;

import org.testng.annotations.Test;

public class Practice {
	
	@Test(groups  = {"PREM","PRABHA"})
	public void test() {

		System.out.println("We  need to build our career1");
	}

	@Test(groups = "PREM")
	public void test1() {

		System.out.println("We  need to build our career2");
	}

	@Test(groups = "PRABHA")
	public void test2() {

		System.out.println("We  need to build our career3");
	}

}
