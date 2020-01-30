
public class Account1 {
	
	int id;
	String name;
	float amount;
	
	void insert(int i, String n, float amt) {
		id=i;
		name=n;
		amount=amt;
	}
	
	void deposit(float amt) {
		amount = amount+amt;
		System.out.println(amt+ " deposited");
		
	}
	
	void withdraw(float amt) {
		if(amount<amt) System.out.println("Insufficient pounds");
		else {
			amount = amount-amt;
			System.out.println(amt+ " withdrawn");
		}
	}
	
	
	void checkBalance() {
		System.out.println("Balance is: "+ amount);
	}
	
	void display() {
		System.out.println(id+" "+name+" "+ amount);
	}

	public static void main(String[] args) {
		

		Account1 a1 = new Account1();
		a1.insert(1, "Andrei", 50000);
		a1.deposit(20000);
		a1.display();
		a1.withdraw(10000);
		a1.display();
		
		
	}

}
