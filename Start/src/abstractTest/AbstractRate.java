package abstractTest;


   abstract class Bank{
	   abstract int getRate();
   }

   class BCR extends Bank{
	   
	   int getRate() {
		   return 5;
	   }
   }



public class AbstractRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new BCR();
		System.out.println(b.getRate());
	}

}
