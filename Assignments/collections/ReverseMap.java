package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class ReverseMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Hari");
		map.put(101, "Naveen");
		map.put(102, "Sam");
		map.put(104, "Balaji");
		// NavigableMap<Integer, String> descendingMap = map.descendingMap();
		List<Integer> keysList = new ArrayList<Integer>();
		for (Entry<Integer, String> eachValue : map.entrySet()) {
			Integer key = eachValue.getKey();
			// String value = eachValue.getValue();
			keysList.add(key);
		}
		Map<Integer, String> reverseMap = new LinkedHashMap<Integer, String>();
		Collections.reverse(keysList);
        //System.out.println(keysList);
		String valueList;
		for (int i = 0; i < keysList.size(); i++) {
			// keysList.get(i);
			valueList = map.get(keysList.get(i));
			reverseMap.put(keysList.get(i), valueList);
		}
		System.out.println(reverseMap);
	}
}
