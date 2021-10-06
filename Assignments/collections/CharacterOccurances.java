package collections;

import java.util.Map;
import java.util.TreeMap;



//convert the string to char array
//Traverse through each character
//choose the character as Key and no. of occurrences as value
//put both key and entry inside the map, if it is not already present
//If the character is already present, then increment the existing value by 1.

public class CharacterOccurances {

	public static void main(String[] args) {
		String name = "welcome to Selenium automation";
		char[] ch = name.toCharArray();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				int value = map.get(ch[i]);
				map.put(ch[i], value+1);
			}
		}
		System.out.println(map);
	
	}
}


