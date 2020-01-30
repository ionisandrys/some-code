package overriding;


class Bank{
	int rate() {
		return 0;
	}
}

class BCR extends Bank{
	
	int rate() {
		return 8;
	}
}

class BRD extends Bank{
	
	int rate() {
		return 10;
	}
}


public class TestOverride {

	public static void main(String[] args) {
		
		BCR b1 = new BCR();
		System.out.println(b1.rate());
		
		BRD b2 = new BRD();
		System.out.println(b2.rate());
		
	}

}
