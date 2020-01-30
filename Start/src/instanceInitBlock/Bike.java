package instanceInitBlock;

public class Bike {

	    int speed;
		Bike(){
			System.out.println("Bike speed is:" + speed);
		}
	
		{speed=90;}
	
	public static void main(String[] args) {
		
		Bike b = new Bike();
		
	}

}
