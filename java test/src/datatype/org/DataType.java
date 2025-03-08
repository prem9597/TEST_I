package datatype.org;

public class DataType {

	public static void main(String[] args) {
		String a = "Prem! You are the best tester in this world";
		String b = "tester";

		StringBuilder ref = new StringBuilder(b);

		if (a.contains(b)) {

			String[] split = a.split(" ");

			for (String Try : split) {
				if (Try.contains(b)) {
					StringBuilder reverse = ref.reverse();
					String replaced = a.replace(b, reverse);
					System.out.println(replaced);
				}
			}
		}
		
		else {
			System.out.println("The target word is not present in string A");
		}

		/*
		 * b.
		 * 
		 * 
		 * String c="";
		 * 
		 * char chars=b.charAt(5); System.out.println(chars);
		 * 
		 * int intval=b.indexOf('a'); System.out.println(intval);
		 * 
		 * String lowe=b.toLowerCase(); System.out.println(lowe);
		 * 
		 * System.out.println(b.toUpperCase());
		 * 
		 * boolean emty=c.isEmpty();
		 * 
		 * System.out.println(emty);
		 * 
		 * System.out.println(b.startsWith("b")); System.out.println(b.endsWith("l"));
		 * System.out.println(b.lastIndexOf('i'));
		 * System.out.println(b.contains("prabha")); System.out.println(b.length());
		 * System.out.println(b.replaceAll("is", "IS"));
		 * System.out.println(b.replace('a', 'A')); System.out.println(b.trim());
		 * System.out.println(b.split(" "));
		 * 
		 * 
		 * String[] ref = b.split(" ");
		 * 
		 * for (String prabha : ref) { System.out.println(prabha); }
		 * 
		 * 
		 * int p = 10;
		 * 
		 * int s = (p < 1) ? 10 : 20; System.out.println(s);
		 */
	}

}
