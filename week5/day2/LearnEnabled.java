package week5.day2;

import org.testng.annotations.Test;

public class LearnEnabled {
	
	@Test
	public void createLead() {
		System.out.println("CreateLead");
		
	}
	
	@Test(enabled = false)
	public void editLead() {
		System.out.println("EditLead");

	}
	
	@Test
	public void deleteLead() {
		System.out.println("DeleteLead");
		
	}

}
