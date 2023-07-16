package JavaPrograms;

import java.util.Scanner;

//import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class PrimeNumber {

	public static void main(String[] args) {
		// number divisible by 1 and itself
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number = ");
		int number = scan.nextInt();
		int num = number/2;
		boolean flag = false;
		scan.close();
		System.out.println("Half number = "+num);
		
		for(int i=2; i<=num;i++) {
			if(number%i==0) {
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Is a prime number.");
		}
		else {
			System.out.println("Not a prime number.");
		}
	}
	

}
