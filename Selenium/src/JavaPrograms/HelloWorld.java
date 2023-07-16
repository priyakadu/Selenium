package JavaPrograms;

import java.util.Scanner;

import Interface.interfaceTrial;

public class HelloWorld {
	 public static void main(String[] args) {
		
			/*
			 * System.out.println(" Hello world");
			 * 
			 * //print integer value
			 * 
			 * for(int i=10; i>=0;i--) { System.out.println(i); System.out.println("\n"); }
			 * 
			 * System.out.println("Please enter First name =  "); Scanner scanner = new
			 * Scanner(System.in); String fnameString = scanner.nextLine(); // this method
			 * returns the line that was skipped
			 * 
			 * System.out.println("Please enter last name: "); String lnameString =
			 * scanner.nextLine();
			 * 
			 * System.out.println("Full name: "+fnameString+" "+lnameString);
			 */	 
		 
		 //swap two numbers
		 
		 int num1 = 10, num2 = 20;
/*		 
		 //Scenario1: Without 3rd variable
		 num1 = num1+num2;
		 num2 = num1-num2; //10
		 num1 = num1 -num2; //
		 
		 System.out.println("Number1 = "+num1+" and Number2 = "+num2);
	
		 //Scenario2: Using 3rd variable
		 int result;
		 result = num1; //10
		 num1 = num2; //20
		 num2 = result;
		 
		 System.out.println("Number1 = "+num1+" and Number2 = "+num2);
		 
		
		 
		 // number is prime or not
		 System.out.println("Please enter number: "); 
		 Scanner scanner = new Scanner(System.in);
		 int number = scanner.nextInt(); // this method
		
		 boolean flag = false;
		 for(int i=2; i<=number/2; i++) {
			 //If remainder is zero then number is not a prime number
			 
			 if(number%i ==0) {
				flag = true;
				 break;
			 }			
		 }
		 if(flag==false) {
			 System.out.println("Is a prime.");
		 }else {
			 System.out.println("Is NOT a prime."); 
		 }
		 
	 
	 
	 
		 
		//Odd or even number
		 // 1, 3, 5 are odd and 2,4,6,8 are even
		 
		 for(int i=1; i<=10; i++ ) {
			 if(i%2 ==0) {
				System.out.println(i +" is EVEN number."); 
			 }else {System.out.println(i +" is ODD number."); }
		 }
		
		
		//reverse string word by word
		 
		 String piaString = "Priya";
		 
		 char[] c1 = piaString.toCharArray();
		 for(int i = c1.length-1; i>=0;i--) {
			 System.out.print(c1[i]);
		 }
		 
		 StringBuilder str1 = new StringBuilder("ROSHAN");
	
		 System.out.println("\nReversed String = "+str1.reverse());
		 
		 
		 
		 String sentence = "Magic LOVE I";
		 String[] words = sentence.split(" ");
		 for(int i = words.length-1; i>=0;i--) {
			 System.out.print(words[i]+" ");
		 }
	* 
		 //star pattern
		 String star = "* ";
		 
		 for(int i=5; i>=0;i--) {
			 for(int j=0; j<=i; j++) {
			 System.out.print(star);	
			 }
			 System.out.println("\n"); 
		 }
	*/	 
		 String actualString = "ABBADAADABBA";
		 StringBuilder str1 = new StringBuilder(actualString);
			String revString = str1.reverse().toString();
		 System.out.println("\nReversed String = "+revString); 
		 
		 if(actualString.equals(revString)) {
			 System.out.println("PASS.. This is palindrome");
		 }else System.out.println("FAIL.. String is not palindrome");
		 
	 }
}
