package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("home")).click();

		// driver.switchTo().window(null) --> accepts the window hanlde

		Set<String> winSet = driver.getWindowHandles();
		List<String> name = new ArrayList<String>(winSet);
		System.out.println("Befeore Title:" + driver.getTitle());
		driver.switchTo().window(name.get(1));
		System.out.println("After Title:" + driver.getTitle());
		//driver.switchTo().window("sak");  //NoSuchWindowException
		driver.switchTo().window(name.get(0));
		System.out.println("Back again Title:" + driver.getTitle());
		driver.close();
		
	//	driver.quit();
		System.out.println(" Number of windows:" + winSet.size());
		

		
		
		
		
		
		

	}

}
