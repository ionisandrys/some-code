package strings;

public class PerformanceTest {

	static String concatWithString() {
		String t = "Andrei";
		for(int i=0; i<5;i++) {
			t=t+" Ionescu";
		}
		return t;
	}
	
	
	static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Andrei");
		for(int i=0;i<100000;i++) {
			sb.append(" Ionescu");
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time with string is: "+(System.currentTimeMillis()-startTime)+" ms");
		startTime = System.currentTimeMillis();
		System.out.println();
		concatWithStringBuffer();
		System.out.println("Time with stringBuffer is: "+(System.currentTimeMillis()-startTime)+" ms");

		System.out.println(concatWithString());
		
	}

}
