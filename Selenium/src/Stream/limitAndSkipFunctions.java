package Stream;

import java.util.Arrays;
import java.util.List;

public class limitAndSkipFunctions {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(11,12,13,14,15,33,44,55);
		
		// Working of limit()
		System.out.println(" *******   Limit function output begins   ******* ");
		list1.stream().limit(4).forEach(x->System.out.println(x));
		
		// Working of skip()
		System.out.println(" *******   Skip function output begins   ******* ");
		list1.stream().skip(5).forEach(x->System.out.println(x));
	}

}
