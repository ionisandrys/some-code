package exceptii;

import java.io.InvalidObjectException;

public class PropChecked {

	void m() throws InvalidObjectException {
		throw new java.io.InvalidObjectException("Error");
	}
	
	void n() throws InvalidObjectException {
		m();
	}
	
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {

		PropChecked p = new PropChecked();
		p.p();
	}

}
