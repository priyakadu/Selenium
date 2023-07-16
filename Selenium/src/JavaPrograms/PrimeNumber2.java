package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// number divisible by 1 and itself
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number = ");
		int number = scan.nextInt();
		int num = number/2;
		int flag =0;
		scan.close();
		
		System.out.println("Half number = "+num);
		
		if(number ==0 || number ==1) {
			System.out.println("Is a prime number");
		}else {
			for(int i=2; i<=num;i++) {
				if(num%i==0) {
					System.out.println("Not a prime number.");
					flag =1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println(" Is a prime number.");
			}
		}
		
		

	}

}
