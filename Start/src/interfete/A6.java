package interfete;

interface Printable{
	void print();
}




public class A6 implements Printable {

	public void print() {
		System.out.println("print");
	}
	
	public static void main(String[] args) {
		
		A6 obj = new A6();
		obj.print();
		
	}

}
