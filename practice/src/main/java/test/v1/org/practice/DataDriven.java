package test.v1.org.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@DataProvider(name = "PRABHA")

	public String[][] method() {

		String[][] ref = new String[1][2];

		ref[0][0] = "PREM ";
		ref[0][1] = " 💕 PRBHA";

		return ref;

	}
}
