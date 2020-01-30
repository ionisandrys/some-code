package colectii;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("One");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");

		for(String h:hs) {
			System.out.println(h);
		}
		
		System.out.println("----------------");
		
		List<String> ls = new ArrayList<String>();
		ls.addAll(hs);
		System.out.println(ls);
		ls.add("TEN");
		ls.addAll(2, hs);
		System.out.println(ls);
		
	}

}
