package week2.day1;

public class LearnString {
	
	// Non primitive data type
	// Its a collection of more than 1 char
	// Class - built-in methods
	// property : Immutable(cannot change the original string)

	public static void main(String[] args) {
	// Create an object for string
		
	// Mthd 1 : using literals(data)
		String testString = "welcomef to testleaf";
		
	//Mthd 2: using the new keyword
		String testString1 = new String();
		testString1 = "Have a great day";
		
		String testString2 = new String("Happy Morning");
	// 1. String Length : str.length()	
	// cntrl 2 L
	// cntrl 1
		int length = testString.length();
		System.out.println(" Length :" + length);
		
  // Find a character in a String
	// charAt()
		
		char ch1 = testString.charAt(0);
		System.out.println("ch1:" + ch1);
		
  // first occurence of the character 
  // 		
		int indexW = testString.indexOf('f');
		System.out.println("indexW: " + indexW);
		int lastIndexOf = testString.lastIndexOf('f');
		System.out.println("index of last f : " + lastIndexOf);
		
		
// Strng to char array conversion		
		System.out.println(" stng: " + testString);
		char[] chArr1 = testString.toCharArray();
		for (int i = 0; i < chArr1.length; i++) {
			System.out.println("chArr["+i+"]: " + chArr1[i]);
		}

// CharArray to a string	
		
		// 
		String upperCase = testString.toUpperCase();
		System.out.println("upperCase:"  + upperCase);
		
		String str2 = "AAAAAA";
		String lowerCase = str2.toLowerCase();
		System.out.println("lowerCase:" + lowerCase);
		
		// character conversion
		char lowerCase2 = Character.toLowerCase('H');
		System.out.println("lowerCase2 char:" + lowerCase2);
		char upperCase2 = Character.toUpperCase('a');
		System.out.println("upperCase2 char:" + upperCase2);
		
		// comparison of the strings
		
		String testString3 = "welcomeF to testleaf";
		String testString4 = "welcomef to testleaf";
		
		boolean equals = testString3.equals(testString4);
		System.out.println("equals:" + equals);
		
		boolean equalsIgnoreCase = testString3.equalsIgnoreCase(testString4);
		System.out.println(" igored case:" + equalsIgnoreCase);
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
