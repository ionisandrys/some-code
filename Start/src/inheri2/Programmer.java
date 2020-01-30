package inheri2;

class Employee{
	
	float salary=20000;
}

public class Programmer extends Employee {

	int bonus = 1000;
	
	public static void main(String[] args) {

		Programmer p1 = new Programmer();
		System.out.println(p1.salary+" "+p1.bonus);
	}

}
