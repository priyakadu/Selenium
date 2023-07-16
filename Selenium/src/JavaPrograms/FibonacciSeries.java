package JavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21………
		
		System.out.print("0,1,1");
		int num1 = 1, num2=1, total;
		for(int i=0; i< 6;i++) {
			total = num1+num2; //2,3
			System.out.print(","+total);
			num1=num2;
			num2= total;
		}
	}

}
