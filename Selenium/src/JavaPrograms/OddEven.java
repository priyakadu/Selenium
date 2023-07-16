package JavaPrograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		//odd number = 1,3,5,7,9
		//even number = 2,4,6,8
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number = ");
		int number = scan.nextInt();
		scan.close();

		if(number%2==0) {
			System.out.println(number+" is even number.");
		}
		else {
			System.out.println(number+" is odd number.");
		}
	}
	
	

}
