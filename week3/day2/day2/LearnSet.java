package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Collection
   // Dynamic size
   // Doesnot allow duplicates
   // Does/doesnot Maintain the insertion Order
   // Implementation Classes
       //   - HashSet - Random Order
       //   - LinkedHashSet - Maintain the order
       //   - TreeSet - Gives an ASCIIordered output
   // Cannot accessed through the index

public class LearnSet {
	public static void main(String[] args) {
		
	//	Set<String> animals = new HashSet<String>();
	//	Set<String> animals = new LinkedHashSet<String>();
		Set<String> animals = new TreeSet<String>();
		animals.add("Tiger");
		animals.add("Monkey");
		animals.add("Lion");
		boolean add1 = animals.add("Leopard");
		System.out.println(add1);
		
		for (String eachAnimal : animals) {
			System.out.println(eachAnimal);
		}
		
		boolean add = animals.add("Leopard");
		System.out.println(add);
		
		// removeAll
		//retainAll
		// sort
		// reverse
		
	}

}
