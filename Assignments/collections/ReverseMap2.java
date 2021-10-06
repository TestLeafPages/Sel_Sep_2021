package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReverseMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a map 
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "APPLE");
		map.put(100, "KIWI");
		map.put(102, "MANGO");
		map.put(104, "MELON");
		// get the key set as a whole
		Set<Integer> keySet = map.keySet();
		// Convert the set to list
		List<Integer> keysList = new ArrayList<Integer>(keySet);
		// Reverse the list (Collections does not accept set)
		Collections.reverse(keysList);
				System.out.println(keysList);
				
		// Create an empty map to store the reversed value		
		Map<Integer, String> reversedMap = new HashMap<Integer, String>();
		for (Integer integer : keysList) {
			String string = map.get(integer);
			reversedMap.put(integer,string);
		}
		System.out.println(reversedMap);
	   
		
	}
}
