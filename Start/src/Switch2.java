
public class Switch2 {

	public static void main(String[] args) {
		
		String levelString = "Expert";
		int level = 0;
		
		switch(levelString) {
		
		case "Beginner": level=1; break;
		case "Expertt": level=2; break;
		case "Profi": level=3; break;
		default : level=0; break;
		}

		System.out.println("The level is: "+level);
	}

}
