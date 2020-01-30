package strings;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {

		StringTokenizer tk = new StringTokenizer("Myn/ame/is/Andrei");
		
		while(tk.hasMoreTokens()) {
			System.out.println(tk.nextToken("/"));
		}
		
	}

}
