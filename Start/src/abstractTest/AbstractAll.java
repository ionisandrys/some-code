package abstractTest;

abstract class Bike2{
	Bike2(){
		System.out.println("Bike constructor");
	}
	
	abstract void run();
	
	void changeGear() {
		System.out.println("gear changed");
	}
}

	class Honda2 extends Bike2{
		void run() {
			System.out.println("Honda is running");
		}
	}

public class AbstractAll {

	public static void main(String[] args) {
		Bike2 b = new Honda2();
		b.run();
		b.changeGear();

	}

}
