package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countOccurenceOfWords {

	public static void main(String[] args) {
		String str1= "Trial for trial of stream trial for Java learning";
		
		List<String> list1 = Arrays.asList(str1.split(" "));
		Map<String,Long> map = list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
