package collections;

import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.map.HashedMap;

public class MostDuplicate {

	public static void main(String[] args) {
		String name = "babba";
		char[] charArray = name.toCharArray();
		char maxOccurance = charArray[0];
		int maxValue = 0;
		
		Map<Character,Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				Integer value = map.get(charArray[i]);
				int newValue = value+1;
				map.put(charArray[i], newValue);
				}else {
					map.put(charArray[i], 1);
				}
			
			Integer value = map.get(charArray[i]);
			if (value>maxValue) {
				maxValue = value;
				maxOccurance = charArray[i];
				
			}
		}
		System.out.println(maxOccurance);
		System.out.println(maxValue);
	}

}



