package week3.day2;

public interface TaxCalculation {
	
	// public static final
	String cmpnyName="Taxer";
	
	// No implementation of methods
	// unimplemented mthds
	// documentation:
	/**
	 * 
	 * @param name
	 * @param text
	 */
	public void taxCalc(String name, double text);

	/**
	 * This method calculates all the deductions of a businessUnit/Person/Co-operative soceity
	 * @author Sheriba
	 * @param name : Name of the businessUnit/Person/Co-operative soceity
	 * @param HRA : House rent allowance
	 * @param LTA 
	 * Exceptions: 
	 */

	public void calcDeductions(String name, double HRA, double LTA);
	
	/**
	 * 
	 * @param name
	 * @param netIncome
	 * @param deductions
	 */
	void calcGrossIncome(String name, double netIncome, double deductions);
	
	/**
	 * 
	 * @return
	 */
	public int taxSlab();
	
	public void commonMthd();
	
	
	

}
