package JavaPrograms;

import java.util.ArrayList;

import Interface.interfaceTrial;


public class isArmstrongNum {

	public static void main(String[] args) {
		// is number armstron? sum of cube should be same as number
		ArrayList list1 = new ArrayList();
		int num = 153;
		
		boolean status = isArmstrong(453);
		System.out.println("Is number armstrong?   "+status);
		
	}
	
	public static boolean isArmstrong(int number) {
		int temp=0;
		boolean flag=false;
		int num = number;
		while(num!=0) {
			 int remainder = num%10;	//3		
			temp = (remainder*remainder*remainder) + temp;
			System.out.println("cube = "+temp);		
			
			num = num/10; //200
		}
		System.out.println("Final sum of individual digits >>> "+temp);
		
		if(temp == number) {
			flag= true;
		}
		return flag;
	}

}
