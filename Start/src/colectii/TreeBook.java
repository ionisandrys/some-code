package colectii;

import java.util.TreeSet;

class Books implements Comparable<Books>  {
	
	int id;
	String name;
	int pages;
	
	Books(int id, String name,int pages){
		this.id=id;
		this.name=name;
		this.pages = pages;
	}
	
	public int compareTo(Books bb) {
		if(pages>bb.pages) {
			return 1;
		}else if(pages<bb.pages) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

public class TreeBook {
	public static void main(String[] args) {

		Books b1 = new Books(3,"A",27);
		Books b2 = new Books(5,"B",21);
		Books b3 = new Books(2,"C",90);
		
		TreeSet<Books> ts = new TreeSet<Books>();
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		
		for(Books bb:ts) {
			System.out.println(bb.id+" "+bb.name+" "+bb.pages);
		}
		
		
	}

}
