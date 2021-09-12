package week2.day2;

public class LearnStrings {

	public static void main(String[] args) {
		
		String str = "Welcome to testleaf today";
		// split()
		
		String[] split = str.split("e");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println("split["+i+"]:  " + split[i]);
		}
		
		// substring - beginning index
		String substring = str.substring(11);
		System.out.println(substring);
		
		// substring - beginning and end index
		// beginning - inclusive
		// End index - exclusive
		String substring2 = str.substring(11,19);
		System.out.println(substring2);
		
		// Replace
		String replace = str.replace("e", "E");
		System.out.println("Replaced str:" + replace );
	
		//8. replace integers, non integers
		
		String str1 = "Wel34co1me12345";
		
		// Integers - d
		// alphabets - D
		String replaceAll = str1.replaceAll("[\\d]", ""); //- non integers - Welcome
		System.out.println(" replaceAll:" + replaceAll);
		
		String replaceAll2 = str1.replaceAll("[\\D]", ""); //- integers - 34112345
		System.out.println(" replaceAll2 as string:" + replaceAll2);
		
		// Rs. 374
		// 374
		// 34112345 + 34
		
		int parseInt = Integer.parseInt(replaceAll2);
		System.out.println("parseInt as number:" + parseInt );
		
		
		
		
		
		
		
		
		
		

		 

		
		
		
		
		
		
		
		

	}

}
