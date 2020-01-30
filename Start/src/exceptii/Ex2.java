package exceptii;

public class Ex2 {

	public static void main(String[] args) {
		
		try {
			
			int data = 50/0;
			System.out.println("Rest of the code");  // daca exceptia apare in try, restul codului nu se mai executa
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
