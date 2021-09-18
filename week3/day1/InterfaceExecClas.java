package week3.day1;

public class InterfaceExecClas {

	public static void main(String[] args) {
		// cannot create an object for an Interface
		// cannot be instantiated
	//	TaxCalculation taxObj = new TaxCalculation();
		
		CalcBusinessTax obj = new CalcBusinessTax();
		obj.calcDeductions("Unit1", 24567, 485769.89);
		obj.calcGrossIncome("Unit1", 347599.76, 4756.89);
		obj.calcBusinessSpecCalculations();
		
	}

}
