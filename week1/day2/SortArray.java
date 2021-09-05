package week1.day2;

import java.util.Arrays;

public class SortArray {
	
// problem statement : find the greatest number in the array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = {34,456,23,1000,1,0};
		
		// step 1: sort the array : Arrays.sort(numArr);
		Arrays.sort(numArr);
		
		// step 2: print the sorted array
		System.out.println("****Sorted array*****");
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("numArr["+i+"]: " + numArr[i]);
		}
		
		// step 3: find the largest number (last element)
		System.out.println(" Largest element in the array:" + numArr[numArr.length-1]);
		
		// step 4: find the smallest number (first element)
		System.out.println(" smallest element in the array:" + numArr[0]);
		
		

	}

}
