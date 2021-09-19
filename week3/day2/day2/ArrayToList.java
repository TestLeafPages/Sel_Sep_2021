package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"Audi", "BMW", "Benz", "Skoda", "Jaguar" };
		// mthd1 : to add using addAll()
		List<String> StrList = new ArrayList<String>();
		StrList.addAll(Arrays.asList(str));
		System.out.println(StrList);
		
		


	}

}
