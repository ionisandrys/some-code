package thisReferenceVariable;

class A{
	
	void m() {
		System.out.println("hello m");
	}
	
	void n() {
		this.m();
	}
}

public class This1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.n();
		

	}

}
