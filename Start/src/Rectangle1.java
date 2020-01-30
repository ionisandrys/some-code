
public class Rectangle1 {

	int length;
	int width;
	
	void insert(int length, int width) {
		this.length=length;
		this.width=width;
	}
	
	void calculateArea() {
		System.out.println("Area is: "+ length*width);
	}
	
	public static void main(String[] args) {
		
		Rectangle1 r1 = new Rectangle1(), r2=new Rectangle1();
		r1.insert(20, 10);
		r1.calculateArea();
		
		r2.insert(200, 20);
		r2.calculateArea();

	}

}
