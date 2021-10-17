package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws IOException {
		
		
		  WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://leafground.com/pages/table.html");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		  
		  
		 
	}

}
