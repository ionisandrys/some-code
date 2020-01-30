package Constructors;

public class StaticCalc2 {

	static void calcFact() {
		int fact=1;
		for(int i=1; i<=5; i++) {
			fact = fact*i;
		}
		System.out.println(fact);;

	}
	
	
	public static void main(String[] args) {
		
		StaticCalc2.calcFact();

	}

}
