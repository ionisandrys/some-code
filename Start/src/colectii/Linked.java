package colectii;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Sheldon");
		list.add("Sheldon2");
		list.add("Sheldon3");

		list.add("Sheldon4");
		list.add("Sheldon5");
		list.add("Sheldon");
		
		for(String i:list) {
			System.out.println(i);
		}
		System.out.println("ELSE...");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
