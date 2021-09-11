package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// Step 1 : manages the driver
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.edgedriver().setup();
		// WebDriverManager.firefoxdriver().setup();

		// Step 2: Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Maximize the browser
		driver.manage().window().maximize();

		// Step 4: Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Step 5: get the title of the current page
		String title = driver.getTitle();
		// System.out.println(" title:" + title);

		// Step 6: Enter username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		
		// Step 7: Enter Password
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
		// click on the Login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
				
	//	WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
	//	crmsfaLink.click();
		
		 driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		 WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		 countryCode.clear();
		 countryCode.sendKeys("4");
		 
		 
	//	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
	//	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("4");
		
		
		
		// Step 6: Close the browser
		// driver.close();

	}

}
