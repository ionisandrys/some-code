package inheri2;

class Animal2{
	void eat() {
		System.out.println("Animal eating...");
	}
}

class Dog2 extends Animal2{
	void bark() {
		System.out.println("Dog barking...");
	}
}

class Puppy extends Dog2{
	void cry() {
		System.out.println("Puppy is crying....");
	}
}

public class MultilevelInheri {

	public static void main(String[] args) {
		
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.cry();
		
		Dog2 d = new Dog2();
		d.bark();

	}

}
