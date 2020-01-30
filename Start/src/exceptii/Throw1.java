package exceptii;

public class Throw1 {

	static void validate(int age) {
		if(age<18)
			throw new ArithmeticException("Not valid!!!!");
		else
			System.out.println("Can vote");
	}
	
	public static void main(String[] args) {

		validate(12);
	}

}
