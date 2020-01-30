package runTimePoli;

class Shape{
	
	void draw() {
	System.out.println("Drawing shape...");
}
}


class Rectangle extends Shape{
	
	void draw() {
		System.out.println("Drawing rectangle");
	}
}




public class TestPoli2 {

	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		s.draw();
	}

}
