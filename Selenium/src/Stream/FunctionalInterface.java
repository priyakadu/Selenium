package Stream;

public class FunctionalInterface {

	public static void main(String[] args) {
		// Multiply 2 numbers using functional interface
		FInterface total = (a,b)->a*b;  // using lambda function to return expression into reference of interface
		System.out.println(total.multiply(6, 7));
	}

}
