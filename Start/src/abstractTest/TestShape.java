package abstractTest;

abstract class Shape{
	abstract void draw(); 
		}

 class Circle extends Shape{
	 void draw() {
		 System.out.println("Circle");
	 }
 }
 
 class Rectangle extends Shape{
	 void draw() {
		 System.out.println("Rectangle");
	 }
 }


public class TestShape {

	public static void main(String[] args) {
		
		Shape s1 = new Circle();
		s1.draw();
		
		Shape s2 = new Rectangle();
		s2.draw();
	}

}
