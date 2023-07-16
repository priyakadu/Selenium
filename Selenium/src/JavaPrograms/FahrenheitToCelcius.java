package JavaPrograms;

import java.util.Scanner;

import Interface.interfaceTrial;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// convert fahrenheit temperature to celcius
		// °C = (°F - 32) × 5/9
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit = ");
		int fInt =  sc.nextInt(); // or sc.nextDouble()
		double celcius = ((fInt - 32)*5)/9;
		System.out.println("Temperature in Celcius = "+celcius);
		
		sc.close();
	}

}
