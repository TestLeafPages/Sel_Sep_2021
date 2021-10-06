package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> mapObj = new TreeMap<Integer,String>();
		// add an entry to map
		mapObj.put(1,"TestLeaf");
		mapObj.put(2,"CTS");
		mapObj.put(3,"Accenture");
		mapObj.put(4,"Hexaware");
		
		
		// Entry --> Return Type
		// <Integer,String> --> Data types of the key and the object
		// eachEntry --> variable name
		// mapObj.entrySet() --> collection of entries in entry set which has a key value pair
		
		//To print the map as a whole
		System.out.println("PRINT ENTRY AS A WHOLE");
		System.out.println("**********************");
		System.out.println(mapObj);
		
		//To print as seperate entries
		System.out.println("PRINT ENTRY AS SEPERATE RECORDS ");
		System.out.println("**********************");
		for(Entry<Integer,String> eachEntry: mapObj.entrySet()) {
			System.out.println(eachEntry);
		}
		
		//To print values alone
		System.out.println("PRINT VALUE OF THE SET ");
		System.out.println("**********************");
		for(Entry<Integer,String> eachEntry: mapObj.entrySet()) {
			System.out.println(eachEntry.getValue());
		}
		
		//To print Key alone
		System.out.println("PRINT key OF THE SET ");
		System.out.println("**********************");
		for(Entry<Integer,String> eachEntry: mapObj.entrySet()) {
			System.out.println(eachEntry.getKey());
		}
		
		// KeySet
		System.out.println(" KEY SET");
		Set<Integer> keySet = mapObj.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		
		
		System.out.println(" COLLECTION OF VALUES ");
		Collection<String> values = mapObj.values();
		for (String string : values) {
			System.out.println(string);
		}
	
		// To get a single value from the map
		System.out.println("***************");
		System.out.println(mapObj.get(2));
				
		
		// To verify if an entry is available in a map using Key/Value
		
		boolean containsKey = mapObj.containsKey(2);
		System.out.println("***************");
		
		if(containsKey)
			System.out.println(" The key is available");
		else
			System.out.println(" The key is not available");
		
		boolean containsValue = mapObj.containsValue("CTS");
		
		
		if (containsValue)
			System.out.println(" The value is available");
		else
			System.out.println(" The value is not available");
		

		// To remove an entry
		System.out.println(" Remove an entry");
		System.out.println("*****************");
		mapObj.remove(3);
		System.out.println(mapObj);
		
		
		
		// To clear/empty the entry set ( Whole Map)
		mapObj.clear();
		System.out.println(" Map cleared");
		System.out.println("*************");
		System.out.println(mapObj);
		
		// To check if map is empty
		boolean empty = mapObj.isEmpty();
		if (empty) {
			System.out.println(" Empty map");
		}
		else
			System.out.println(" Not an Empty Map");
	}

}
