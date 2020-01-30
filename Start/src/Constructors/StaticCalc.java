package Constructors;

 class Calculate{
	 
	 static int cube(int n) {
		 return n*n*n;
	 }
 }


public class StaticCalc {

	public static void main(String[] args) {
		
		int result = Calculate.cube(3);
		System.out.println(result);
	}

}
