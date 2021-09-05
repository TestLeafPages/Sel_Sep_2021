package week1.day2;

public class MyKid {

	public static void main(String[] args) {

		MyMobile kidObj = new MyMobile();
		System.out.println(" Amps from Kid class:" + kidObj.amps);
		System.out.println(" Brand name from Kid class:" + kidObj.brandName);

		kidObj.makeCalls();
	//	kidObj.payMoney();
	}

}
