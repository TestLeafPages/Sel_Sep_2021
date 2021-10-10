package week6.day2;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDependencyBetweenTestcases {
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demo");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

	}

	@Test(dependsOnMethods = "createLead")
	public void editLead() {
		System.out.println("Edit Lead");

	}
	
	@Test(dependsOnMethods = {"createLead","editLead"})
	public void deleteLead() {
		System.out.println("Delete Lead");

	}
	
}
