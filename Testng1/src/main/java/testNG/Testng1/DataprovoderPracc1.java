package testNG.Testng1;

import org.testng.annotations.DataProvider;

public class DataprovoderPracc1 {
	@DataProvider(name="PREM", parallel = true)
	public String[][] dataset(){
		String[][] data=new String[2][2];
		
		data[0][0]="student";
		data[0][1]="Password123";
		data[1][0]="Password123";
		data[1][1]="student";
		
		return data;
	}

}
