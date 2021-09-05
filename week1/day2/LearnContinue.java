package week1.day2;

public class LearnContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue; // code to be executed is skipped fo rthis condition alone
			}
			System.out.println(i);
		}

		System.out.println(" Out of the for loop");
	}

}
