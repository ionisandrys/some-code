
public class SwitchStatement {

	public static void main(String[] args) {
		
		int age = 20;
		
		switch(age) {
		
		case 10 : System.out.println("Age is too low");  break;
		case 20 : System.out.println("That's the age");  break;
		case 30 : System.out.println("Age to high"); break;
		
		default : System.out.println("code executed if all cases don't match");
		
		}
		System.out.println();
		
		int month = 7;
		String monthName="";
		
		switch(month) {
		
		case 1 : monthName="Ianuarie"; break;
		case 2 : monthName="Februarie"; break;
		case 7 : monthName="Iulie";  break;
		default : monthName = "Nu este gasita";
		
		System.out.print(monthName);
		
		}
		
		
		char ch='O';    
	    switch(ch)  
	    {  
	        case 'a':   
	            System.out.println("Vowel");  
	            break;  
	        case 'e':   
	            System.out.println("Vowel");  
	            break;  
	        case 'i':   
	            System.out.println("Vowel");  
	            break;  
	        case 'o':   
	            System.out.println("Vowel");  
	            break;  
	        case 'u':   
	            System.out.println("Vowel");  
	            break;  
	        case 'A':   
	            System.out.println("Vowel");  
	            break;  
	        case 'E':   
	            System.out.println("Vowel");  
	            break;  
	        case 'I':   
	            System.out.println("Vowel");  
	            break;  
	        case 'O':   
	            System.out.println("Vowellll");  
	            break;  
	        case 'U':   
	            System.out.println("Vowel");  
	            break;  
	        default:   
	            System.out.println("Consonant");  
	    }  
		
		

	}

}
