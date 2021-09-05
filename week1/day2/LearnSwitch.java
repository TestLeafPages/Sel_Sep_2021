package week1.day2;

public class LearnSwitch {
	public static void main(String[] args) {
  // switch - case 
  // optional : break;
	//	int day = 4;
		int day, a,b;
		a = 2;
		b= 2;
		
		switch(a*b)
		{
			case 1: 
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5: 
				System.out.println("friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");	
				break;
			default:
				System.out.println(" Not a valid day");
		}
				
		
	}

}
