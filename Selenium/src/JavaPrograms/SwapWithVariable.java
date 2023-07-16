package JavaPrograms;

public class SwapWithVariable {

	public static void main(String[] args) {
		int num1 = 11;
		int num2=22;
		int temp;
		
		System.out.println("Number 1 before reversal = "+num1);
		System.out.println("Number 2 before reversal = "+num2);
		
		temp = num1;
		num1= num2;
		num2 = temp;
		
		System.out.println("Number 1 after reversal = "+num1);
		System.out.println("Number 2 after reversal = "+num2);

	}

}
