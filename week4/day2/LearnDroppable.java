package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDroppable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/drop.html");
	
	WebElement webDrag = driver.findElement(By.id("draggable"));
	WebElement webDrop = driver.findElement(By.id("droppable"));
	
	Actions builder = new Actions(driver);
	builder.dragAndDrop(webDrag, webDrop).perform();
	
	
	
	
}
}
