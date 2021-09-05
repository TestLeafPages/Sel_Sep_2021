package week1.day2;

public class LearnReturn {

	public static void main(String[] args) {
	/*	boolean t = true;
		
		if(t==false) {
			return;   // comes out of the method 
		}
		
		System.out.println("Out of if");*/
		
		int a = 11; 
		int b = 7;
		int sum = a + b;
		
		if(sum==10)
		{
			return;
		}
		
		else
			System.out.println("Not returned");
		
		System.out.println("In Method");
		
	}
}
