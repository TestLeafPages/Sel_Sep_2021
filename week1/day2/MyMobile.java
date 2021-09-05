package week1.day2;

public class MyMobile {

	// properties/variables/state
	float screenSize;
	int cost = 20000;
	char logo;
	float amps = 1.5f;
	long mobileNumber;
	boolean isTouchScreen;
	String brandName = "Samsung";

//actions/behaviour/methods
//	makeCalls()
//	payMoney()
//	viewGallery()
//	sendSMS()
//	setAlarm()
//	getCost()
//	isTouchScreen()

// Syntax
	// AccessSpecifier returnType methodName arguments {method body}

	// Access Specifier for class: public and package

	// Access Specifier for methods:
	/*
	 * public : accessed by alll the members private: accsessed only by the class
	 * protected: package(default)
	 */

	public void makeCalls() {
		
		System.out.println(" making calls");
		
	}

	private void payMoney() {
		System.out.println(" Paying Money");
	}
	
	public int getCost() {
		
		return cost;
	}
	
	public String getSMS() {
		String sms = " Hi";
		int a =10;
		return sms;
	}
	
	// arguments
	public void printSMS(String str) {
		System.out.println(" SMS from print SMS():"  + str);
	}
	
	
	

	public static void main(String[] args) {
		// create a copy of the class and use it
		// Instantiate / create an object for the class
		// syntax: className obj = new classname()
		
		MyMobile samsung = new MyMobile();
		
	
		float ampSamsung = samsung.amps;
		String brandNameSam = samsung.brandName;
		int costSam = samsung.cost;
		
		System.out.println(" Amps of samsung: " + ampSamsung);
		
		System.out.println("Brand Name:" + samsung.brandName);
		System.out.println(" cost :" + costSam);
		
		samsung.makeCalls();
		samsung.payMoney();
		
		int costSamsung =  samsung.getCost();
		System.out.println(" costSamsung from the method" + costSamsung);
		
		String sms = samsung.getSMS();
		System.out.println("sms :" + sms);
		
		samsung.printSMS(sms);
		
		MyMobile apple = new MyMobile();
		apple.amps=2.5f;
		System.out.println(" Amps of apple: " + apple.amps);
		
	//	MyMobile apple = new MyMobile();
		

	}

}
