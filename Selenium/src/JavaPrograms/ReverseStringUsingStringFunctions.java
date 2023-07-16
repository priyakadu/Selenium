package JavaPrograms;

import java.util.Scanner;

public class ReverseStringUsingStringFunctions {

	public static void main(String[] args) {
		String string1 = "PRIYA";
		String string2 = "NIVAAN";
		
		String reverseString, string3;
		
		// Using StringBuilder
		StringBuilder strbldrBuilder = new StringBuilder(string1);
		reverseString = strbldrBuilder.reverse().toString();	
		System.out.println("Reversed string  >>> "+reverseString);
		
		
		// Using StringBuffer
		StringBuffer strBuffer = new StringBuffer("Nivi");
		reverseString = strBuffer.reverse().toString();
		System.out.println("Reversal by string buffer = "+string2);
	
		// Using split()
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string here: ");
		string3 = scan.nextLine();
		scan.close();
		String[] str1 = string3.split("");
		for(int i= str1.length-1; i>=0; i--) {
			System.out.print(str1[i]);
		}
		
		// Using charAt()
		
		
		
		
	}

}
