package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	
	@Test(priority = -1,invocationCount =5)
	public void createLead() {
		System.out.println("CreateLead");

	}
	
	@Test
	public void editLead() {
		System.out.println("EditLead");

	}
	
	@Test(priority = 3)
	public void deleteLead() {
		System.out.println("DeleteLead");

	}

}
