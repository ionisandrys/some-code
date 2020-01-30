package accessModifierss;


class A{
	private int data = 40;
	private void msg() {
		System.out.println("Hello msg");
	}
	
	private A() {
		  // private constructor = we cannot instantiate 
		//   the class A
	}
}



public class TestPrivate {

	public static void main(String[] args) {
		
	//	A a = new A();    // cannot be instantiated because of private constructor
	//	System.out.println(a.data);
	}

}
