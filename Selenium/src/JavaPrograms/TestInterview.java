package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class TestInterview {
	
	
	
	public static void main(String[] args) {
		String string = "abaddabbadba";
		
		Set<CharSequence> get = findPalindromesFromString(string);
		for(CharSequence ch: get) {
			System.out.println("Palindrome = "+ch);
		}
		
		boolean flag = false;
		int size;
				
		String string1 = string.substring(0, 3); //aba
		String string2 = string.substring(5, 9); //abba
		
		flag = isPalindrome(string1);
		if(flag) {
			System.out.println("Length of string = "+getSizeOfPalindrome(string2));
		}
		
		flag = isPalindrome(string2);
		if(flag) {			
			System.out.println("Length of string = "+getSizeOfPalindrome(string2));
		}
		
	}
	
	public static boolean isPalindrome(String str) {
		
		StringBuilder strBldrBuilder = new StringBuilder();
		strBldrBuilder.append(str);
		
		String reversed = strBldrBuilder.reverse().toString();
		
		if(reversed.equals(str)) {
			return true;
		}else return false;
		
	}
	
	public static int getSizeOfPalindrome(String str) {
		return str.length();
	}
	
	public static Set<CharSequence> findPalindromesFromString(String input){
		
		Set<CharSequence> out = new HashSet<CharSequence>();
	    int length = input.length();
	    for (int i = 0; i <= length; i++) {
	        for (int j = i , k = i+1; j >= 0 && k < length; j--, k++) {
	            if (input.charAt(j) == input.charAt(k)) {
	                out.add(input.subSequence(j, k + 1));
	            } else {
	                break;
	            }
	        }
	    }
	    return out;
	}
	
	

}
