package innerclasses;

public class MemberInner1 {

	private int data = 30;
	
	class Inner{
		void msg() {
			System.out.println("Data is: "+data);
		}
	}
	
	public static void main(String[] args) {

		MemberInner1 mb = new MemberInner1();
		MemberInner1.Inner in = mb.new Inner();
		
		in.msg();
	}

}
