package thisReferenceVariable;

class A2{
	
	A2(){
		System.out.println("This is A Constructor");
	}
	
	A2(int x){
		this();
		System.out.println(x);
	}
}

public class This2 {

	public static void main(String[] args) {
		
		A2 a = new A2(10);
		
	}

}
