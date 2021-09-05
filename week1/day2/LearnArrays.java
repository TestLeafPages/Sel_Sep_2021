package week1.day2;

public class LearnArrays {
	
	public static void main(String[] args) {
		
		
		String brandName = "Samsung";
		String brandName1 = "Apple";
		String brandName2 = "Redmi";
		String brandName3 = "MI";
		
		String[] strArr = {"Samsung","Apple", "Redim", "Mi", "aaa"};
		int[] numArr = {2,34,2,67,345};
		char[] charArr = {'A','B','C'};
		boolean[] boolArr = {true,false,true,true};
		
		
		// how do I access the elements
		System.out.println(strArr[2]);
		System.out.println(charArr[1]);
		
		
		// size of the array 
		int lengthArr = strArr.length;
		System.out.println("Length of an Array:" + lengthArr);
		
		// access all the lements of an array
		//   i = 0 to i<= 4
		//   0 to 3
		for (int i = 0; i <= strArr.length; i++) {
			System.out.println("strArr["+i+"]:" + strArr[i]);
			//ArrayIndexOutOfBoundsException
		}
		
		// how to get the last element 
		System.out.println(" last element:" + strArr[lengthArr-1]);
		
		//strArr[4]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


}
