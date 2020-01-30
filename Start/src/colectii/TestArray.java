package colectii;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	
	int id;
	String name;
	int age;
	
	Student(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}

public class TestArray {

	public static void main(String[] args) {

		Student s1 = new Student(1,"Sheldon", 28);
		Student s2 = new Student(1,"Howard", 26);
		Student s3 = new Student(1,"Penny", 25);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
		}


	}

}
