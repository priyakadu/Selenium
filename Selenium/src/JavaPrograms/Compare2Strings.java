package JavaPrograms;

public class Compare2Strings {

	public static void main(String[] args) {
		// Compare two strings
		String s1 = "Hello Kitty";
		String s2 = "hello kitty";
		compareStrings(s1,s2);
		
		compareStrings("hello kitty",s2); // this will return zero
	}

	// create compare function
	
	public static void compareStrings(String s1, String s2) {
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are same");			
		}else System.out.println("Strings are different");	
	}
}
