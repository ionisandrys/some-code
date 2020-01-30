package colectii;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("Andrei1");
		ll.add("Andrei2");
		ll.add("Andrei3");
		ll.add("Andrei4");

		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator it = ll.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
