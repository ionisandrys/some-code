package colectii;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Sheldon");
		list.add("Penny");
		list.add("Raj");
		list.add("Penny");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
	}}

}
