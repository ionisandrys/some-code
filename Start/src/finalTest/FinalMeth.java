package finalTest;


class Car{
	
	final void run() {
		System.out.println("Car is running 200mph");
	}
}




public class FinalMeth extends Car {

	//void run() {
		
	//}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.run();
	}

}
