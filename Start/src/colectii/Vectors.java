package colectii;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		
		v.add("Sheldon");
		v.add("Sheldon2");
		v.add("Sheldon3");
		v.add("Sheldon4");
		v.add("Sheldon5");
		v.add("Sheldon");
		
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		



	}

}
