package superRef;


class Animal{
	
	Animal(){
		System.out.println("Animal constructor...");
	}
	String color = "white";
	
	void eat() {
		System.out.println("Animal is eating...");
	}
}

class Dog extends Animal{
	
	Dog(){
	//	super();
		System.out.println("Dog constructor");
	}
	
	String color = "black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void eat() {
		System.out.println("Dog is eating bone...");
		super.eat();
	}
}

public class SuperInstanceVar {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.printColor();
		d1.eat();
		

	}

}
