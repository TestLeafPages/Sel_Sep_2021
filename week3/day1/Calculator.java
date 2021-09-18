package week3.day1;

public class Calculator {
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(" add:" + c);
	}
	
	public void add(int a, int b, int c) {
		
	}

	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(2, 10);
		obj.add(2, 6, 5);
	}

}
