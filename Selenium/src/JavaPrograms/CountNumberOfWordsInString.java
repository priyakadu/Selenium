package JavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		// Using Hashmap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
/*		String str = "Hi world";
		
		String[] strArray = str.split(" ");
		int length = strArray.length; //2
		
		
		for(int i=0; i<length;i++) {
			map.put(strArray[i],i+1);k
		}
		
		System.out.println("Count of words = "+map.size());
	*/	
		// Count how many words are repeated
		String str1 = "Priya is good Priya likes good music";
		String[] strArray = str1.split(" ");
		int length = strArray.length; //7
		
		for(int i=0; i<length;i++) {
			//if word repeats, increase the counter
			if(map.containsKey(strArray[i])) {
				int counter = map.get(strArray[i]);
				map.put(strArray[i], counter+1);
			}else {
				map.put(strArray[i], 1);
			}
			
		}
		System.out.println("Map words = "+map);
		
		// Using while loop
		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>) itr.next();
			System.out.println("Key = "+me.getKey()+"; Value = "+me.getValue());
		}
		
		//Using for each loop
		
		
		
	}

}
