package strings;

public class StringBufferclass {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("HelloWorld");
		sb.append(" this is Earth ");
		System.out.println(sb);
		
		sb.insert(25, "Picard");
		System.out.println(sb);
	}

}
