package handlingArrays;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInArrays {

		

	

public static void main(String[] args) {

		int arr[] = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 14, 19, 18, 17, 20 };
		// int lenArray = arr.length;
		
		int count;
		for (int i =0; i <= arr.length - 1; i++) {
			count = 0;
			for (int j = i+1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
					
				}
			}
			if (count > 0) { 
				System.out.println("Duplictaed no is : " + arr[i]);
			}
		}

				
			}

	
}
