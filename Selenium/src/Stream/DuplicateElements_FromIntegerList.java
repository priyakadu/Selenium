package Stream;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements_FromIntegerList {

	public static void main(String[] args) {
		// Here we have a list of integers and we need to find 
		
		List<Integer> list1 = Arrays.asList(11,28,30,28,45,30,22,30);
		Set<Integer> set = new HashSet<>();
		// Below we are filtering only non-duplicate elements
//		list1.stream().filter(x->set.add(x)).forEach(x->System.out.println(x));
		
		//To get the duplicate elements, just add ! in code as below
//		list1.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x)); // This will still give output as some duplicate numbers
		
		//To get duplicate elements without repetitive number in o/p, add intermediate output to set
		list1.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x)); 
	}

}
