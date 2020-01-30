package inheri2;

class Vehicle{
	
	void run() {
		System.out.println("Car is running");
	}
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running");
	}
}

public class Override1 {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.run();
	}

}
