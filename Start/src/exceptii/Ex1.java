package exceptii;

public class Ex1 {

	public static void main(String[] args) {

		try {
			int a=10;
			System.out.println(a/0);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		
		try {
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException n) {
			System.out.println(n);
		}
		
		try {
			String s1 = "abc";
			int i = Integer.parseInt(s1);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		try {
			int[] arr = new int[5];
			arr[8]=10;
		}catch(Exception e) {
			System.out.println(e);
		}
		
		int b= 50/0;
		System.out.println("Ultima linie de cod");
		
		
		
		
		
	}

}
