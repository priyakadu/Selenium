package JavaPrograms;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		int num=3;
		
		for(int i=1;i<=num;i++) {
					for(int j = i; j>=i; j--) {
						System.out.print(" ");
						System.out.print("*");
					}
					
					System.out.println("");
		}
		

	}

}
