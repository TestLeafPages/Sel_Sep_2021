package week3.day2;

// Implementation class
public class CalcBusinessTax implements TaxCalculation, IncomeCalculation {

	// Instance variable
	public static int income;
	public String nameUnit;
	
	
	public void calcDeductions(String name, double HRA, double LTA) {
		System.out.println("Business unit name :" + name);
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		System.out.println("Business unit name :" + name);
		System.out.println(" Business unit NetIncome:" + netIncome);
		System.out.println(" Business unit Deductions: " + deductions);
	}
	
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

	// Method from the Interface IncomeCalculation
	public double calcNetIncome(String name, double income1, double income2) {
		System.out.println(" Calcc NetIncome from the Interface IncomeCalculation ");
		// TODO Auto-generated method stub
		return 0;
	}

	public void commonMthd() {
		// TODO Auto-generated method stub
		System.out.println(" Method that is common for among both the interfaces");
	}

	
	public int commonMthd(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static final void calcTax() {
		
		System.out.println(" Static method");
	}
	
	public static void main(String[] args) {
		CalcBusinessTax obj = new CalcBusinessTax();
		
		obj.calcBusinessSpecCalculations();
		calcTax();
		System.out.println(obj.nameUnit);
		System.out.println(income);
		
		
		
	}
		
	
	
	
	
	
	
	

}
