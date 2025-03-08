package datatype.org;

public class HelloWorld {

	public static void main(String[] args) {
		
		int a=1234;
		
		String b=(String.to )a;

		/*
		 * int num = 29; boolean isprime = true;
		 * 
		 * if (num <= 1) { isprime = false; } else { for (int a = 2; a <=
		 * Math.sqrt(num); a++) { if (num % a == 0) { isprime = false; } }
		 * 
		 * }
		 * 
		 * System.out.println(isprime ? num + " is a prime number." : num +
		 * " is not a prime number.");
		 */
		/*
		 * int a=159,temp=a,sum=0; while (temp!=0) {
		 * 
		 * int digit=temp%10; sum +=Math.pow(digit, 3); temp/=10; } if (a==sum)
		 * {System.out.println("is amstrong"); } else {
		 * System.out.println("is not amstrong"); }
		 */

		/*
		 * int[] arr = { 1, 11, 67, 4, 0, 5 }; int largest = arr[0]; int largest1=
		 * arr[1];
		 * 
		 * for (int num : arr) { if(num>largest && num>largest1) { largest=num; } else
		 * if(num>largest|| num>largest1){ largest=num; largest1=largest;
		 * 
		 * } } System.out.println(largest);
		 */
		/*
		 * int[] arr = {1, 11, 5, 7, 9,13}; int largest = arr[0]; for (int num : arr) {
		 * if (num > largest) { largest = num; } } System.out.println(largest);
		 */
		/*
		 * // Count Vowels and Consonants
		 * 
		 * String a = "PREMKUMAR"; int countCons = 0; int countvow = 0;
		 * 
		 * for (char b : a.toCharArray()) { if ("aeiouAEIOU".indexOf(b) != -1) {
		 * countvow++; } else if (Character.isLetter(b)) { countCons++; } }
		 * 
		 * System.out.println(countCons); System.out.println(countvow); x`x //Prime num
		 * check
		 * 
		 * int a=11;
		 * 
		 * if (a%2==0) { System.out.println("Isprime"); } else {
		 * System.out.println("Is not a prime"); }
		 * 
		 */
		/*
		 * // Fibonacci Serie
		 * 
		 * int a = 10, b = 0, c = 1; System.out.print(b + "," +c);
		 * 
		 * for (int i = 1; i <= a; i++) {
		 * 
		 * int d = b + c; System.out.print(","+d);
		 * 
		 * b = c; c = d; }
		 */

		/*
		 * //Palindrome String a="MA1DAM"; StringBuilder b=new StringBuilder(a);
		 * StringBuilder reverse = b.reverse(); if(a.equals(reverse.toString())) {
		 * System.out.println("word is a palindrome"); }else {
		 * System.out.println("word is not  palindrome"); }
		 * 
		 * //String Reverse String a = "PREM PRABHA PRIYA";
		 * 
		 * String b = "PRABHA";
		 * 
		 * StringBuilder ref = new StringBuilder(b);
		 * 
		 * if (a.contains(b)) {
		 * 
		 * StringBuilder reverse = ref.reverse(); String replace = a.replace(b,
		 * reverse); System.out.println(replace); } else { System.out.
		 * println("Unable to findout the given word.Please check the data which is enter by you"
		 * ); }
		 */

	}
}
