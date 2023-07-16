package JavaPrograms;

public class Trial {

	public static void main(String[] args) {

		String one = "Random";
		String two = "RAndom";
		
		if(one==two) {
			System.out.println("String is same ");
		}else {
			System.out.println("String is different ");
		}
		
		
		if(one.equals(two)) {			
			System.out.println("String is equal ");
		}else {
			System.out.println("String is different ");
		}
		
		if(one.equalsIgnoreCase(two)) {			
			System.out.println("String is equal ");
		}else {
			System.out.println("String is different ");
		}

		
		int a=11,b=22;
		a=a+b;		
		b=a-b;		
		a=a-b;
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
		int x=44,y=11,z;
		z=x;
		x=y;
		y=z;
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		
		//number is prime or not
		int number = 13;
		boolean isPrime = true;
		int num = number/2;
		for(int i=2; i<num;i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		
		}
		if(isPrime) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is NOT prime");
		}
		
	}

}
