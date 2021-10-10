package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import steps.BaseClass;

public class HooksImplementation extends BaseClass{
	
	@Before
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();  // Driver is initialized (Session id)
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps");

	}
	
	@After
	public void postCondition() {
		driver.close();

	}

}
