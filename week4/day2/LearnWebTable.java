package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");

		// Step 1: Find the table
		WebElement webTable = driver.findElement(By.id("table_id"));
		// Step 2 : Getting the rows
		
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		// find the size of the row
		System.out.println(" Number of rows:" + tableRows.size());
		
		// Step 3: Get the count of the columns
		// Pick up any single row
		WebElement webFirstRow = tableRows.get(0);
		List<WebElement> tableColumn = webFirstRow.findElements(By.tagName("th"));
		
		System.out.println(" Number of columns :" + tableColumn.size());
		
		
		// Getting all the data 
		for (WebElement webElement : tableRows) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		// Need a specific column
		for (int i = 1; i < tableRows.size(); i++) {
			WebElement indivRow = tableRows.get(i);
			List<WebElement> findIndivColumn = indivRow.findElements(By.tagName("td"));
			String text = findIndivColumn.get(1).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
