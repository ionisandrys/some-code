package colectii;

import java.util.ArrayList;

public class ArrayRetainAll {

	public static void main(String[] args) {

		ArrayList al = new ArrayList<String>();
		
		al.add("Sheldon");
		al.add("Sheldon2");
		al.add("Sheldon3");
		
		ArrayList al2 = new ArrayList<String>();
		al2.add("Sheldon3");
		al2.add("Sheldon4");
		
		al.retainAll(al2);
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		System.out.println(al.get(0));
		al.set(2, "Penny");
		System.out.println(al);
	}

}
