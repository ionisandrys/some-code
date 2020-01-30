
public class IfElse {

	public static void main(String[] args) {
		
		int year = 2154;
		if(year>2020) {
			System.out.println("It's true");
		}
		else {
			System.out.println("False");
		}
		System.out.println();
		
		int year2 = 2020;
		
		if(((year2 % 4 ==0) && (year2 % 100 !=0)) ||(year2 % 400 ==0)) {
			System.out.println("leap year");
		}else 
			System.out.println("Common year");
		
		System.out.println();
		
		// ternary
		int age = (43<56)?5:3;
		System.out.println(age);
		
		String result = (56>43)?"Fals":"Adevarat";
		System.out.println(result);
		
		System.out.println();
		
		// check number
		
		int num = 20;
		if(num<20)  System.out.println("Mai mic decat 20");
		else if(num==20)  System.out.println("Match");
		else if(num>20)  System.out.println("Mai mare");
		
		
		
		
		
		
		
		
		
	}

}
