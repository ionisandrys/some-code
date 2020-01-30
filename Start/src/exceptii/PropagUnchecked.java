package exceptii;

public class PropagUnchecked {

	void m() {
		int data = 60/0;
	}
	
	void n() {
		m();
	}
	
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("Handled");
		}
	}
	
	public static void main(String[] args) {

		PropagUnchecked p = new PropagUnchecked();
		p.p();
		
		System.out.println("Flow....");
	}

}
