package colectii;

import java.util.ArrayList;

class Book{
	
	int id;
	String name;
	
	Book(int id, String name){
		this.id=id;
		this.name=name;
	}
}

public class BookTest {

	public static void main(String[] args) {
			
		Book b1 = new Book(1,"Capra cu 3 iezi");
		Book b2 = new Book(2,"Amintiri");
		
		ArrayList<Book> ar = new ArrayList<Book>();
		ar.add(b1);
		ar.add(b2);
		
		for(Book b:ar) {
			System.out.println(b.id+" "+b.name);
		}
	}

}
