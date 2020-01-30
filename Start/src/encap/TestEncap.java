package encap;

public class TestEncap {

	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setId(1);
		a.setName("Dan");
		a.setEmail("dasd@fsdj");
		a.setAmount(20000f);
		
		System.out.println(a.getId()+" "+a.getEmail()+" "+a.getName());
	}

}
