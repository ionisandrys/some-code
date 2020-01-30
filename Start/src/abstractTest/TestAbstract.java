package abstractTest;


 abstract class Bike{
	abstract void run(); 
}

 class Honda extends Bike {
	 void run() {
		 System.out.println("Honda is running");
	 }
 }
 
 
public class TestAbstract {

	public static void main(String[] args) {
		
		Bike b = new Honda();
		b.run();

	}

}
