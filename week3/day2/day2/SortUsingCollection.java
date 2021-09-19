package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		
		String[] str = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		List<String> strList = new ArrayList<String>();
		strList.addAll(Arrays.asList(str));
		
		Collections.sort(strList);
		System.out.println(" Sorted Output");
		System.out.println(strList);
		
		Collections.reverse(strList);
		System.out.println(" Reversed Output");
		System.out.println(strList);
		

	}

}
