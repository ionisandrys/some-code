package exceptii;

import java.io.IOException;

public class CaughtThrows {

	void method() throws IOException{
		throw new IOException("Error...");
	}
	
	public static void main(String[] args) {
 
		try {
			CaughtThrows c = new CaughtThrows();
			c.method();
		}catch(Exception e) {
			System.out.println("Handled");
		}
	}

}
