
public class Employee1 {

	int id;
	String name;
	float salary;
	
	void insert(int id, String name, float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	 void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
	
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1();
		e1.insert(1, "Andrei", 20000);
		e1.display();
		

	}

}
