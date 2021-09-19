package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		// syntax
		// <> - Generics
		// Wrapper class
		// String - String
		// int - Integer
		// boolean - Boolean
		// byte - Byte
		// short - Short
		// float - Float
		// char - Character

		// List - Interface
		// Implementation class : ArrayList
		// Allows duplicates
		// Maintains the insertion order
		// creating an empty list
		List<String> fruits = new ArrayList<String>();

		// Add the elements to the list
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Jackfruit");
		fruits.add("Strawberry");

		// To find the size of the list
		int size = fruits.size();
		System.out.println(" Size of the list: " + size);

		// getting an element of list
		System.out.println(" List element:" + fruits.get(2));

		// Print the list
		System.out.println(fruits);

		for (int i = 0; i < size; i++) {
			System.out.println(fruits.get(i));
		}
		fruits.add("Banana");
		// for each
		System.out.println("*****For each*****");
		for (String eachFruit : fruits) {
			System.out.println(eachFruit);
		}
		
		// Insert based on the position
		fruits.add(2, "Guava");
		fruits.add("Guava");
		
		System.out.println("*****For each*****");
		for (String eachFruit : fruits) {
			System.out.println(eachFruit);
		}
		
		// remove an entry
		// fruits.remove(2); 
		fruits.remove("Guava"); // removes the first occurence of that element
		System.out.println("*****For each*****");
		for (String eachFruit : fruits) {
			System.out.println(eachFruit);
		}
		
		fruits.clear();
		System.out.println("*****For each*****");
		for (String eachFruit : fruits) {
			System.out.println(eachFruit);
		}
		// no exceptions thrown when an emoty list is accessed.
		
	}

}
