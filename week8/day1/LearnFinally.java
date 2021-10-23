package week8.day1;

import java.io.IOException;

public class LearnFinally {

	public static void main(String[] args) throws IOException {
		int x = 10;
		int y = 0;

		try {
			System.out.println(x / y);
			
		} finally {
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		}

		System.out.println("End of the program");

	}

}
