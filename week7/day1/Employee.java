package week7.day1;

public class Employee extends CompanyInfo{
	
	int empId;
	String empName;
	String companyName;
	boolean empStatus;
	
	//Will create default constructor implicitly
	Employee(){
		this(100,"Hari","TestLeaf",true); // to call parameterized constructor
		System.out.println("Child - Default Constructor");
	}
	
	Employee(int empId, String empName, String companyName, boolean empStatus ){
		//this(); // to call the default constructor
		System.out.println("Parameterized Constructor");
		this.empId = empId;
		this.empName = empName;
		this.companyName = companyName;
		this.empStatus = empStatus;
	}

	public static void main(String[] args) {
	Employee emp1 = new Employee();
//	Employee emp2 = new Employee();
	
	
	  System.out.println(emp1.empId); 
	  System.out.println(emp1.empName);
	  System.out.println(emp1.companyName); 
	  System.out.println(emp1.empStatus);
	  
		/*
		 * System.out.println(emp2.empId); System.out.println(emp2.empName);
		 * System.out.println(emp2.companyName); System.out.println(emp2.empStatus);
		 */
	 
	

	}

}
