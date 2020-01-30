package interfete;

interface Drawable{
	void draw();
}

class Rectangle implements Drawable{
	
	public void draw() {
		System.out.println("Drawing");
	}
}


public class TestInterface1 {

	public static void main(String[] args) {
		
		Drawable d = new Rectangle();
		d.draw();
	}

}
