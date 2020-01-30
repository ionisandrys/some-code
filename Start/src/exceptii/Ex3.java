package exceptii;

public class Ex3 {

	public static void main(String[] args) {

		int i = 10;
		int y = 0;
		try {
			int result = i/y;
		//	System.out.println(result);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("The rest");
		
		System.out.println("----------------------------------------------------------");
		
		
		try {
			int s = 50/0;
		}catch(Exception e){
			
			int s2 = 100/0;
		}
		
		System.out.println("Code....");
		
		
		
		
		
	}

}
