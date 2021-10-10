package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	
	@Test
	public void login() {
		//"Leaftaps - TestLeaf Automation Platform"
		String expTitle = "TestLeaf Automation Platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String actTitle = driver.getTitle();
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		//Soft Assert
		SoftAssert softAssert = new SoftAssert();
			
		softAssert.assertEquals(actTitle, expTitle);
		
		
		//Hard Assert		
		//To compare 2 value
		//Assert.assertEquals(actTitle, expTitle);
		
		//to check boolean value
	    //Assert.assertTrue(displayed);// When the value is true - Pass, when the value is false - Failed
		//Assert.assertFalse(displayed); //When the value is false - Passed, when the value is true - Failed
		
		System.out.println("Last line of program");// status of last execution
		//mandatory step for SoftAssert
		softAssert.assertAll();
	
		

	}

}
