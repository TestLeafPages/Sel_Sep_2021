package week6.day2;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGrouping {
	
	@Test(groups ="functional")
	public void createLead() {
		System.out.println("Create Lead");
		
	}

	@Test(groups ={"functional","smoke"})
	public void editLead() {
		System.out.println("Edit Lead");
		throw new NoSuchElementException();

	}
	
	@Test(groups = "regression", dependsOnGroups = "smoke")
	public void deleteLead() {
		System.out.println("Delete Lead");

	}
	
	
	@Test(groups ={"functional","regression"}, dependsOnGroups = "smoke")
	public void duplicateLead() {
		System.out.println("Duplicate Lead");

	}
	
	@Test(groups ={"smoke"})
	public void mergeLead() {
		System.out.println("Merge Lead");

	}
	
	
}
