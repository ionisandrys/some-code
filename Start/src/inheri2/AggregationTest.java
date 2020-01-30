package inheri2;

class Adress{
	String city, state, country;
	
	Adress(String city, String state, String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Emp{
	
	int id;
	String name;
	Adress adress;
	
	
	
	public Emp(int id, String name, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}


	void display() {
		System.out.println(id+"  "+name);
		System.out.println(adress.city+"  "+ adress.state +"  "+adress.country);
	}
	
}

	public class AggregationTest {

		public static void main(String[] args) {
		
       Adress adress1 = new Adress("Iasi"," Moldova"," Romania");
       Adress adress2 = new Adress("Dolj"," Oltenia"," Romania");
       
       Emp e1 = new Emp(1,"Dan", adress1);
       e1.display();
       
       
	}

}
