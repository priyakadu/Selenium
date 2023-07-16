package JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Pia");
		alist.add("Jiya");
		alist.add("Tia");
		
		// Using for loop
		for(int i = 0; i<alist.size();i++) {
			System.out.println("For loop >>> "+alist.get(i));
		}
		
		
		//Using while loop
		Iterator<String> itr = alist.iterator();
		while(itr.hasNext()) {
			System.out.println("While loop >>> "+itr.next());
		}
		
		
		//Using for-each loop
		for(String s: alist) {
			System.out.println("For-Each loop >>> "+s);
		}

	}

}
