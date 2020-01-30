package strings;

public class StringCompare {

	public static void main(String[] args) {

		String s1 = "Honda";
		String s2 = "Honda";
		String s3 = new String("Honda");
		String s4 = "Toyota";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s4));
		
		System.out.println(s3.equals(s2));
		System.out.println("==");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}
