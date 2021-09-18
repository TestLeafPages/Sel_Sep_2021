package week3.day1;

// Implementation class
public class CalcBusinessTax implements TaxCalculation {

	public void calcDeductions(String name, double HRA, double LTA) {
		System.out.println("Business unit name :" + name);
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		System.out.println("Business unit name :" + name);
		System.out.println(" Business unit NetIncome:" + netIncome);
		System.out.println(" Business unit Deductions: " + deductions);
	}
	
	
/*	public int taxSlab() {
		int a = 23;
		return a;
	}*/
		
	// own implementations of that class
	
	public void calcBusinessSpecCalculations() {
		System.out.println(" Specific to CalcBusinessTax class");
	}

	public void taxCalc(String name, double text) {
		// TODO Auto-generated method stub
		
	}

	public int taxSlab() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	

}
