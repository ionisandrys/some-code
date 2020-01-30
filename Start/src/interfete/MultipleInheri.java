package interfete;

interface Printablee{
	void print();
	default void msg() {
		System.out.println("Default method");
	}
	
	static int cube(int x) {
		return x*x*x;
	}
}

interface Showable{
	void show();
}



public class MultipleInheri implements Printablee, Showable {

	public void print() {
		System.out.println("Printing");
	}
	
	public void show() {
		System.out.println("Showing");
	}
	
	public static void main(String[] args) {
		
		MultipleInheri i1 = new MultipleInheri();
		i1.print();
		i1.show();
		i1.msg();
		System.out.println(Printablee.cube(5));

	}

}
