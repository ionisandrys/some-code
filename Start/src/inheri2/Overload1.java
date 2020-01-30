package inheri2;




public class Overload1 {

	static int add(int x, int y) {
		return x+y;
	}
	
	static int add(int x, int y, int z) {
		return x+y+z;
	}
	///////////////////////////////////////////////////////////////////////
	
	static int adunare(int a, int b) {
		return a+b;
	}
	
	static double adunare(double a, double b, double c) {
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Overload1.add(7, 3));
		System.out.println(Overload1.add(7, 5, 1));
		
		System.out.println(Overload1.adunare(20, 10));
		System.out.println(Overload1.adunare(20.1, 40.6, 20.9));

	}

}
