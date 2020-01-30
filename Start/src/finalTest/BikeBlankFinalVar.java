package finalTest;







public class BikeBlankFinalVar {

	static final String color;
	
	static{ color = "green";}
	
	
	
	
	
	final int speed;
	
	BikeBlankFinalVar(){
		speed=120;
		System.out.println(speed);
	}
	public static void main(String[] args) {
		
		new BikeBlankFinalVar();

	}

}
