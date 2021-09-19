package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://erail.in/");
		
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MS",Keys.ENTER);
		
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU",Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> trainNumbers = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
		
		int size = trainNumbers.size();
		System.out.println(" number of trains:" + size);
		
		for (int i = 0; i < size ; i++) {
			String trainNum = trainNumbers.get(i).getText();
			System.out.println(" tarin number:" + trainNum);
		}
				
		for (WebElement webElement : trainNumbers) {
			System.out.println(" Train num:" + webElement.getText());
		}
	}
}
