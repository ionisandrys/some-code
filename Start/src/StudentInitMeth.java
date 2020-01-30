
public class StudentInitMeth {

	int id;
	String name;
	
	void insertRecord(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	void displayInfo() {
		System.out.println(id+" "+name);
	}
	
	
	
	public static void main(String[] args) {

		StudentInitMeth s1 = new StudentInitMeth();
		s1.insertRecord(20, "Mihai");
		s1.displayInfo();

	}

}
