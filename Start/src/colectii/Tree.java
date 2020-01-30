package colectii;

import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Aa");
		ts.add("Ab");

		ts.add("Ac");

		ts.add("Av");

		ts.add("An");
/*
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator itr2 = ts.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	*/	
		System.out.println(ts.pollFirst()+" "+ts.pollLast());
		
		System.out.println(ts.descendingSet());
		
		System.out.println(ts.headSet("Ac", true));
	}

}
