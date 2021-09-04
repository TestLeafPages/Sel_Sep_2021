package week1.day1;
// if the number is odd or even

//if the number is odd or even
/*
 * 
 * 1. Get a number
   2. Divide it by 2 
   3. Check the remainder;
   4. If(remainder is 0)
     number is even
   % -- Gives the remainder 
 */

public class LearnIf {

	public static void main(String[] args) {
     int number = 11;
     // number%2 -- remainder
     // conditon -- true or false
     
     if(number%2 == 0) {
    	System.out.println(" the number is even"); 
     }
     else if(number%2 != 0 && number%4==0) {
    	 System.out.println(" Number is odd");
     }
     
     else
    	 System.out.println(" Number is neither odd nor even");
     
     // + - * / %
     
     // modulo %  - divides and gives the remainder
        
 
    
	}

}
