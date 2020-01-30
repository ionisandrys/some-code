package runTimePoli;


class Bank{  
float getRateOfInterest(){return 0;}  
}  

class BCR extends Bank{  
float getRateOfInterest(){return 8.4f;}  
}  

class BRD extends Bank{
	float getRateOfInterest() {return 9.0f;}
}

    class TestPolimorfism {

	public static void main(String[] args) {
		Bank b;
		b=new BCR();
		System.out.println(b.getRateOfInterest());
		
		b=new BRD();
		System.out.println(b.getRateOfInterest());

	}

}
