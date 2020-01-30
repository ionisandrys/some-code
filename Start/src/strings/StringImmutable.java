package strings;

public class StringImmutable {

	public static void main(String[] args) {

		String s = "Andrei";
		s.concat(" Ionescu");  // string is immutable
		System.out.println(s);
		
		String s2 = s.concat(" Ionescu");
		System.out.println(s2);
		
		System.out.println();
		
		s=s.concat(" Ionescu");
		System.out.println(s);
	}

}
