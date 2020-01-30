package exceptii;

public class MultiCatch {

	public static void main(String[] args) {

		try {
			int[] a = new int[5];
			a[5]=10/0;
		}
		
		
		catch(ArithmeticException e){
			System.out.println("Arith exception");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index exception");
		}
			
	  
	   catch(Exception e){System.out.println("common task completed");} 
		
	}
}



