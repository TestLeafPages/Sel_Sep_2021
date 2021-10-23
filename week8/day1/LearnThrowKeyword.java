package week8.day1;

public class LearnThrowKeyword {

	public int division(int num1, int num2) {
		int res = 0;
		if(num1 > num2) {
			res = num1 / num2;
		}
		else {
			throw new ArithmeticException("Invalid input: intput 1 is smaller than input2");
		}
		return res;

	}

	public static void main(String[] args) {
		LearnThrowKeyword ltk = new LearnThrowKeyword();
		
		int result = ltk.division(10, 20); // first num > second num 
		
		System.out.println(result);
		
		System.out.println("End of the program");

	}

}
