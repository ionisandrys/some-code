package exceptii;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterEx {

	public static void main(String[] args) {

		PrintWriter pw;
		try {
			
			pw=new PrintWriter("aww.txt");
			pw.println("saved");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("Saved success");
	}

}
