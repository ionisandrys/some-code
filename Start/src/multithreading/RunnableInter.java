package multithreading;

public class RunnableInter implements Runnable {

	public void run() {
		System.out.println("Runnable interface.....");
	}
	

	public static void main(String[] args) {

		RunnableInter r1 = new RunnableInter();
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
