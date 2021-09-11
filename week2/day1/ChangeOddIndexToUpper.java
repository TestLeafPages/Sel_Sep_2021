package week2.day1;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {

		String str = "changeme";
		
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(i%2 != 0) { // odd index
				char upperCase = Character.toUpperCase(charArray[i]);  // converting to upper case
				System.out.print(upperCase);
			}
			else  // even index, just print
				System.out.print(charArray[i]);
		}
	}
}
