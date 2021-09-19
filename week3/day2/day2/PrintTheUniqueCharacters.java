package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintTheUniqueCharacters {
	
// 1. Declare a string "amma123"
// 2. convert to character array
// 3. Expected output - am123
	
	public static void main(String[] args) {
		String str = "amma123";
		char[] charArray = str.toCharArray();
		// empty set
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);
		}
	  System.out.println(charSet);	
	}
}
