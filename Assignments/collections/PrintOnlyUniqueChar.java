package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyUniqueChar {

	public static void main(String[] args) {
		String name = "babu";
		char[] charArray = name.toCharArray();

		Set<Character> uniqueName = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			uniqueName.add(charArray[i]);
		}
		System.out.println(uniqueName);
	}
}
