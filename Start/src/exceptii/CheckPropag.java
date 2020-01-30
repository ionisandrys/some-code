package exceptii;

import java.io.IOException;

public class CheckPropag {

	void m() throws IOException{
		throw new IOException("Error");
	}
	
	void n() throws IOException{
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

		CheckPropag c = new CheckPropag();
		c.p();
	}

}
