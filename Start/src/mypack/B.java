package mypack;

import pack.A;





public class B extends A{

	public static void main(String[] args) {
		
		A obj = new A();
	//	obj.msg();     method is not visible because msg is default
		B b = new B();
		b.write();   // visible only with inheritance
	}

}
