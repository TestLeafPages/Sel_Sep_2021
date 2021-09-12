package week2.day2;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LearnImplicitWait {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://dev112573.service-now.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			String status = driver.executeScript("return document.readyState").toString();
			System.out.println(status);
			driver.switchTo().frame(0);
			
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("user_password")).sendKeys("India@123");
			driver.findElement(By.id("sysverb_login")).click();
			
			driver.switchTo().defaultContent();
			
			String status1 = driver.executeScript("return document.readyState").toString();
			System.out.println(status1);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//button[contains(text(),'Create dashboard version')]")).click();

		}

	}

