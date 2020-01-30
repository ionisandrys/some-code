package thisReferenceVariable;

class Student{
	
	int id;
	String name;
	float fee;
	String course;
	
	Student(int id, String name, float fee){
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
	
	Student(int id, String name, float fee, String course ){
		this(id,name,fee);
		this.course=course;
	}
	
	
	void display() {
		System.out.println(id+" "+name+" "+fee+" "+course);
	}
}


public class TestThis {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Andrei", 25);
		Student s2 = new Student(2,"Dan",46,"Algebra");
		s1.display();
		s2.display();
	}

}
