package handlingArrays;

import java.util.Arrays;

public class MisssingNumbers {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		// Sort the array
		Arrays.sort(arr);
		// Missing Number is
		System.out.println("Missing Number is");
		// arr[0] = 1
		// arr[1] = 2
		// arr[2] = 3
		
		// j = 1 ; 
		for (int j = arr[0]; j < arr.length; j++) {
			System.out.println("j :" +j);
			System.out.println("[j-1]: " + (j-1));
			System.out.println("arr[j-1]: " +arr[j-1]);
			
			// int[] arr = {1,2,3,4,6,7,8};
		//	if(1 != arr[1-1] )
			// if (1!=1)
			// if (2! = arr[1]) // 2! = 2 
			// if (3! = arr[2]) // 3! = 3
			// if (4! = arr[3]) // 4! = 4
			// if (5! = arr[4]) // 5! = 6 ( true)
			// if (6! = arr[5]) // 6! = 7 ( true)
			 
			if(j != arr[j-1]) {
				System.out.println("The missing Element is :" +j);
				break;
			}
			}
		}
}
