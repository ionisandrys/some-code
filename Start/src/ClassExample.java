
public class ClassExample {

	int id;
	String name;
	
	
	public static void main(String[] args) {
		
		ClassExample c1 = new ClassExample();
		ClassExample c2 = new ClassExample();
		c1.id=10;
		c1.name="Gigi";
		
		c2.id=20;
		c2.name="Daniel";
		
		System.out.println(c1.id+" "+c1.name);
		System.out.println(c2.id+" "+c2.name);
		
	}

}
