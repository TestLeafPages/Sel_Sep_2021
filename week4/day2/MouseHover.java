package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/shop/");
		WebElement webKids = driver.findElement(By.linkText("KIDS"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(webKids).perform();
		// Right Click
		builder.contextClick().perform();
		// double Click
		
		
		
		
		
		
		
		
		
		

	}

}
