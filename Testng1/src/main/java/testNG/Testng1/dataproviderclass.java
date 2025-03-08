 package testNG.Testng1;

import org.testng.annotations.DataProvider;

public class dataproviderclass  {
	@DataProvider(name = "data",indices = {1,0},parallel = true)

	public String[][] TestData() {
		String[][] dataset = new String[2][2];
		dataset[0][0] = "student";
		dataset[0][1] = "Password123";
		dataset[1][0] = "Password123";
		dataset[1][1] = "Password123";
		return dataset;
	}


}
