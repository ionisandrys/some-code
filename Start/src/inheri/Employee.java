package inheri;

public class Employee {

	float salariu = 20000;
}

    class Programmer extends Employee{
    	
    	int bonus = 1000;
    	
	public static void main(String[] args) {
		
		Programmer p1 = new Programmer();
		System.out.println(p1.salariu+" "+p1.bonus);

	}

}
