package JavaPrograms;

import java.util.Scanner;

public class ReverseStringWithCharArray {

	public static void main(String[] args) {
//		String str = "Priya";
		System.out.println("Enter string: ");
		Scanner scan = new Scanner(System.in);
		String string= scan.next();
		
		 scan.close();
		char charArray[] = string.toCharArray();
		System.out.println("array = "+charArray.length);		
				
		for(int i = charArray.length -1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
