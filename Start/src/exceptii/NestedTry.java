package exceptii;

public class NestedTry {

	public static void main(String[] args) {

		try {
			
			try {
			System.out.println("Dividing...");
			int b = 30/0;
		}catch(ArithmeticException e) {
			System.out.println(e);}
		
		try {
			int[] a = new int[5];
			a[6]=5;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		
		
	}catch(Exception e) {
		System.out.println("Try handled");
	}
		
		System.out.println("Normal flow");

	
	
	try{  
		   int data=25/5;  
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e){System.out.println("Null pointer ex?");}  
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }  
	
	
	
	
	
	
	
	
	
	
}
