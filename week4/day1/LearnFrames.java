package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/frame.html");
		
		// driver.findElement(By.id("Click")).click();
		// Throws the NoSuchElementException:
		
		// Simple frame
		WebElement frame1 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();
		// It takes me out of all the frames and lands the control in the main pafe
		driver.switchTo().defaultContent();
		
		WebElement secondFrame = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
		driver.switchTo().frame(secondFrame);
		
		driver.switchTo().frame("frame"); // id
		
		driver.findElement(By.id("Click1")).click();
	//	driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
