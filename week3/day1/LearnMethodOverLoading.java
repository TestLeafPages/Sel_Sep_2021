package week3.day1;

// Employee details
public class LearnMethodOverLoading {
	
	public void getEmployeeDetails(){
		int empId = 101;
		String empName = "Hari";
		System.out.println(" Employee name:" + empName);
		System.out.println(" Employee Id:" + empId);
	}
	// overload
	
	public void getEmployeeDetails(int empId) {
		System.out.println(" Overloaded Mthd 1");
		System.out.println(" Employee Id:" + empId);
	}
	
	public void getEmployeeDetails(String empName) {
		System.out.println(" Overloaded Mthd 2");
		System.out.println(" Employee Id:" + empName);
	}
	
	public void getEmployeeDetails(int empId, String empName ) {
		System.out.println(" Overloaded Mthd 3");
		System.out.println(" Employee Id:" + empId);
	}
	
	public void getEmployeeDetails(String empName, int empId ) {
		System.out.println(" Overloaded Mthd 4");
		System.out.println(" Employee Id:" + empId);
	}
	
	
	public static void main(String[] args) {
		LearnMethodOverLoading emp = new LearnMethodOverLoading();
		emp.getEmployeeDetails();
		emp.getEmployeeDetails(456);
		emp.getEmployeeDetails("Dhivya");
		emp.getEmployeeDetails(123, "Vidya");
		emp.getEmployeeDetails("Babu", 235);
		
		

	}

}
