package test.v1.org.practice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test3 {
	
	
	@Test
	void first(String[] a) {
		SoftAssert refe=new SoftAssert();
		System.out.println(a[0]);
		System.out.println(a[1]);
		refe.assertEquals("PREM", a[1]);
		refe.assertEquals("PREM", a[0]);
	}
	

}
