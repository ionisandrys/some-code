package strings;

public class StringConcat {

	public static void main(String[] args) {

		String s = "Andrei"+" Ionescu";
		System.out.println(s);
		
		String s1 = "Andrei";
		String s2 = " IOnescu";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		String s4 = 5+8+"Andrei"+4+6;
		System.out.println(s4);
		
		System.out.println(s.substring(1, 9));
	}

}
