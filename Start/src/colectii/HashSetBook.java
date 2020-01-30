package colectii;

import java.util.LinkedHashSet;

class Book2{
	
	int id;
	String name;
	
	Book2(int id, String name){
		this.id=id;
		this.name=name;
	}
	
}
public class HashSetBook {

	public static void main(String[] args) {
		
		Book2 b1 = new Book2(1,"B");
		Book2 b2 = new Book2(2,"A");
		Book2 b3 = new Book2(3,"F");
		Book2 b4 = new Book2(4,"Z");
		Book2 b5 = new Book2(5,"T");
		Book2 b6 = new Book2(6,"R");

		LinkedHashSet<Book2> hs = new LinkedHashSet<Book2>(); // maintains order
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		hs.add(b5);
		hs.add(b6);
		
		
		for(Book2 b:hs) {
			System.out.println(b.id+" "+b.name);
		}
		
	}

}
