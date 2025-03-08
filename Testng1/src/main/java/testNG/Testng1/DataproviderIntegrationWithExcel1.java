package testNG.Testng1;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataproviderIntegrationWithExcel1 {

	@DataProvider( parallel = true)
	public  String[][] dataset() throws IOException {

		String[][] data1 = DataproviderIntegrationWithExcel.getdata();
		return data1;
	}
}
