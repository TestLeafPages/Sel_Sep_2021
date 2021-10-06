package handlingArrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,56,8};
	
		Arrays.sort(data);
	
		// 2,3,4,6,7,11
		// 0,1,2,3,4,5 -- Index
		// length -- 6
		//  
		
		for (int i = 0; i <= data.length-1; i++) {
			System.out.println(data[i]);
		}
		// print the second largest number
		System.out.println("The Second largest number is : " +data[data.length-2]);
		System.out.println();
		
	}

}
