package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Window.html");
		
		 File src1 = driver.getScreenshotAs(OutputType.FILE);
		 File dst = new File("./snaps/seat.png");
		 FileUtils.copyFile(src1, dst);
		 
		 // locate webelement and take screenshot of that 
		 WebElement doNotClose = driver.findElement(By.id("color"));
	
		 File src2 = doNotClose.getScreenshotAs(OutputType.FILE);
		 File dst2 = new File("./snaps/button.png");
		 FileUtils.copyFile(src2, dst2);
		 

	}

}
