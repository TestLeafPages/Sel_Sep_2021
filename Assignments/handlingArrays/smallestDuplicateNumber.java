package handlingArrays;

import java.util.Arrays;

public class smallestDuplicateNumber {
	/*Find the first duplicate number in the given array
	Int[] numbers = {2,5,3,7,2,7,2,1};
	Find the smallest valued duplicate number  => 2*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,5,3,7,2,7,2,1};
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == numbers[i+1]) {
				System.out.println(numbers[i]);
				break;
			}
		}

	}
}
