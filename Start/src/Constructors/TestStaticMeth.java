package Constructors;

class Student{
	
	int id;
	String name;
	static String college = "ITS";
	
	static void change() {
		college = "LTN";
	}
	
	Student(int i, String n){
		id = i;
		name=n;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	
}

public class TestStaticMeth {

	public static void main(String[] args) {

		Student s1 = new Student(1,"ANdrei");
		Student s2 = new Student(2, "Dan");
		
		s1.display();
		
		s2.change();
		s2.display();
		
		
	}

}
