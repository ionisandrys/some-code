package multithreading;

public class TestStart extends Thread {

	public void run() {
		System.out.println("Running...");
	}
	
	
	public static void main(String[] args) {

		TestStart t = new TestStart();
		try {
		t.sleep(5000);
		t.start();
	}catch(Exception e) {
		System.out.println(e);
	}

}}
