package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNestedCatch {

	public static void main(String[] args) throws InterruptedException {
		  WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		try {
			driver.findElement(By.id("username")).sendKeys("Demo");
			
		} catch (StaleElementReferenceException e) {
			
			try {
				Thread.sleep(5000);
				driver.findElement(By.id("username")).sendKeys("Demo");
			} catch (Exception e1) {
				System.out.println(e1);
			}
		}

		System.out.println("End of the program");

	}

}
