package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnList2 {
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		
		

		// Add the elements to the list
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Jackfruit");
		fruits.add("Strawberry");
		
		Set<String> animals = new TreeSet<String>();
		animals.add("Tiger");
		animals.add("Monkey");
		animals.add("Lion");
		
		System.out.println("**************************");
		// copy a list to another list
		List<String> animalList = new ArrayList<String>(animals);
		System.out.println(animalList);
	
		
		System.out.println(" ******FruitList*******");
		System.out.println(fruits);
		
		List<String> newFruits =new ArrayList<String>();
		
		// Add the elements to the list
		newFruits.add("DragonFruit");
		newFruits.add("PineApple");
		newFruits.add("Jackfruit");
		newFruits.add("Strawberry");
		newFruits.add("WaterMelon");
		newFruits.add("BueBerry");
		
		
		System.out.println(" ******New FruitList*******");
		System.out.println(newFruits);
		
		//fruits.removeAll(newFruits);
		fruits.retainAll(newFruits);
		
		System.out.println(" ******FruitList*******");
		System.out.println(fruits);
		System.out.println(newFruits);
		
		// find Interscetion -- find common  retainAll
		// remove duplicates - removeAll
		
		
		// sorting the list/collections
		Collections.sort(newFruits);
		System.out.println(" Sorted List");
		System.out.println(newFruits);
		
		// 
		Collections.reverse(newFruits);
		System.out.println(" Reversed List");
		System.out.println(newFruits);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
