package week1.day2;

// problem statement: Sum of the digits in a given number
// Input : 2345
// output : 2+3+4+5 =14
// 
public class LearnWhile {
	public static void main(String[] args) {

		int number = 2345;
		int quotient = 0, remainder = 0, sum = 0;

		while (number != 0) {
			quotient = number / 10;
			System.out.println("quotient:" + quotient);
			remainder = number % 10;
			System.out.println("Rem:" + remainder);
			sum = sum + remainder;
			System.out.println("Sum" + sum);
			number = quotient;
		}
		System.out.println(sum);
	}
}
