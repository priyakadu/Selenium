package JavaPrograms;

public class SwapWithoutVariable {

	public static void main(String[] args) {
		int num1 = 10;
		int num2=20;
		
		System.out.println("Number 1 before reversal = "+num1);
		System.out.println("Number 2 before reversal = "+num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("Number 1 after reversal = "+num1);
		System.out.println("Number 2 after reversal = "+num2);
	}

}
