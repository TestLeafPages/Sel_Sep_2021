package collections;

import java.util.Map;
import java.util.TreeMap;

public class OccurancesInArrray {

	public static void main(String[] args) {
		int num[] = { 2, 3, 5, 6, 2, 3, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (map.containsKey(num[i])) {
				Integer value = map.get(num[i]);
				int newValue = value + 1;
				map.put(num[i], newValue);
			} else {
				map.put(num[i], 1);
			}

		}
		System.out.println(map);
	}

}
