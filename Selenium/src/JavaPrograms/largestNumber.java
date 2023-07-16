package JavaPrograms;

public class largestNumber {

	public static void main(String[] args) {
		// Find largest number from array
		
		int[] intArray = {22,34,99,87,56,42};
		int sizeOfArray = intArray.length;
		System.out.println("Size of array = "+sizeOfArray);
		int max=intArray[0]; //22
		for(int i=0;i<sizeOfArray;i++) {
			if(intArray[i]> max) {
				max = intArray[i];
			}
			
		}
		System.out.println("Largest number = "+max);
	}

}
