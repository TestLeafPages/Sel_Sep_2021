package week1.day2;

import java.util.Iterator;

// jumping statement
public class LearnBreak {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i==5)	{
				break;  // comes/jumps out of the current loop
			}
			System.out.println(i);
		}
		
		System.out.println(" Out of the for loop");
		
		
		
	}
}