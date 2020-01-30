package Constructors;

public class StudentStatic1 {

	int id;
	String name;
	static String college = "LTN";
	
	StudentStatic1(int i, String n){
		id=i;
		name=n;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+ college);
	}
	
	
	public static void main(String[] args) {
		
		StudentStatic1 s1 = new StudentStatic1(1,"Andrei");
		StudentStatic1 s2 = new StudentStatic1(2, "Dan");
		s1.display();
		s2.display();

	}

}
