package testNG.Testng1;

import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class scanner {

	public static void main(String[] args) throws IOException {

		Scanner ref = new Scanner(System.in);

		String a = "C:\\Users\\gokul\\Downloads\\java.pdf";

		
		while(ref.hasNext()) {
			String values = ref.next(a);
			
			System.out.println(values);
		}
	}
}
