package JavaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// When original string and reverse string are equal then its palindrome
		String str1 = "AIA";
		String reversed = ReverseStringUsingStringFunctions(str1);
		if(str1.equals(reversed)) {
			System.out.println("IS PALINDROME");
		}else System.out.println("NOT PALINDROME");
		

	}
	
	public static String ReverseStringUsingStringFunctions(String str){
		StringBuilder strBdr = new StringBuilder(str);
		return strBdr.reverse().toString();
	}

}
