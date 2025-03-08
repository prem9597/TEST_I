package exception.org;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exception {

	public static void main(String[] args) throws IOException {

		File ref = new File("C:\\Users\\gokul\\Videos\\Captures\\prem.txt\\prabha.txt");
		/*
		 * // ref.mkdir(); // ref.createNewFile(); System.out.println(ref.isFile());
		 * System.out.println(ref.isDirectory()); System.out.println(ref.exists());
		 * System.out.println(ref.canRead()); System.out.println(ref.canWrite());
		 * System.out.println(ref.canExecute()); String[] list = ref.list(); for (String
		 * string : list) { System.out.println(string); } File[] listFiles =
		 * ref.listFiles(); for (File string : listFiles) { System.out.println(string);
		 * }
		 */
//		
//		FileReader read=new FileReader(ref);
//		read.read();
		FileWriter write =new FileWriter(ref,false);
		FileReader read =new FileReader(ref);
		//write.write("FGFDGFDG");
	
		
		BufferedWriter wrt=new BufferedWriter(write);
		BufferedReader rd=new BufferedReader(read);
		if(!rd.readLine().isEmpty()) {
		wrt.write("PREM");
		wrt.newLine();
		wrt.write("PRABHA");
		wrt.newLine();
		}
		wrt.close();
		write.close();
		
	}

}
