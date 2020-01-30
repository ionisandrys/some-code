package interfete;

interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A{
	public void c() {
		System.out.println("This is C...");
	}
}


class M extends B{
	public void a() {
		System.out.println("This is a...");
	}
	public void b() {
		System.out.println("This is B");
	}
	public void d() {
		System.out.println("D");
	}
}
public class TEst {

	public static void main(String[] args) {

		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
		
		
		
	}

}
