package testNG.Testng1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ListenersTestLevel.class})

public class SampleTestMethodsForListnr {
	@Test
	void method1() {
		System.out.println("Method is passed");

	}

	@Test
	void method2() throws Exception {
		throw new Exception("Method is Failed");
	}

	@Test(dependsOnMethods = "method2")
	void method3() {
		System.out.println("Method is skipped");
	}

	/*
	 * @Test void method4() { System.out.println("Method is passed"); }
	 * 
	 * @Test void method5() { System.out.println("Method is passed"); }
	 * 
	 * @Test void method6() { System.out.println("Method is passed"); }
	 */
}
