package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		// Step 1 : manages the driver
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.edgedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		// Step 2: Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step 4: Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Step 5: get the title of the current page
		String title = driver.getTitle();
		System.out.println(" title:" + title);

		// Step 6: Enter username
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("demosalesmanager");
		
		// Get the vaue entered in the text field
		System.out.println("Username:" + userName.getAttribute("value"));

		// Step 7: Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// Usage of getText()
		String text = driver.findElement(By.xpath("//label[text()='Username']")).getText();
		System.out.println(" Text:" + text);

		// Usage of getAttribute()
		
		String idAttr = driver.findElement(By.xpath("//input[@id='username']")).getAttribute("id");
		System.out.println(idAttr);

		String classAttr = driver.findElement(By.xpath("//input[@id='username']")).getAttribute("class");
		System.out.println(classAttr);

		// click on the Login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// verify if the 
		WebElement crmsfaLink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		boolean CRMdisplayed = crmsfaLink.isDisplayed();
		if(CRMdisplayed == true)
			System.out.println(" In the TestLeaf Automation Platform page");
		else
			System.out.println(" Not in the correct page");
		// click on the crm/sfa link
		crmsfaLink.click();
		
		

		// Click on the leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// Click on the Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// Step 6: Close the browser
		// driver.close();

	}

}
