package finalTest;


class Bike{
	
	final int speedlimit = 6;
	
	void change() {
		// speedlimit = 7;
	}
	
	
}
public class FinalVar {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		
		System.out.println(b.speedlimit);

	}

}
