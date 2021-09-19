package week3.day2;

public class InterfaceExecClas {
	public static void main(String[] args) {
		// cannot create an object for an Interface
		// cannot be instantiated
	//	TaxCalculation taxObj = new TaxCalculation();
		CalcBusinessTax obj = new CalcBusinessTax();
		obj.calcDeductions("Unit1", 24567, 485769.89);
		obj.calcGrossIncome("Unit1", 347599.76, 4756.89);
		obj.calcBusinessSpecCalculations();
		obj.calcNetIncome("Unit1", 3456.56, 457607.00);
		obj.commonMthd();
		System.out.println(" Interface variable: " + TaxCalculation.cmpnyName);
	//	TaxCalculation.cmpnyName = "Unit2";
	//	System.out.println(TaxCalculation.cmpnyName);
	}
}
