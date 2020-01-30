package exceptii;

public class ArrayEx {

	public static void main(String[] args) {
		
		try {
			
			int[] arr = {24,4,1,5};
			System.out.println(arr[7]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
