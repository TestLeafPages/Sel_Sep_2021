package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Alert.html");

		// SIMPLE ALERT
		// click on the AlertBox button
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		// transfer the control to the current active dialog
		Alert alert = driver.switchTo().alert();
		// Get the text from the alert dialog
		String text2 = alert.getText();
		System.out.println(" Text from the simple alert box:" + text2);
		// Click OK
		Thread.sleep(2000);

		// Throws the UnhandledAlertException
		// driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();

		alert.accept();
		// alert box is not active / closed
		// Throws the NoAlertPresentException
		/*
		 * String text2 = alert.getText();
		 * System.out.println(" Text from the simple alert box:" + text2);
		 */

		// CONFIRMATION ALERT
		// Click on the confirm Alert box button
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(2000);
		// alert.accept();
		alert.dismiss();

		String text = driver.findElement(By.id("result")).getText();

		if (text.contains("You pressed Cancel")) {
			System.out.println(" You have pressed the cancel button");
		} else
			System.out.println(" You have presses the OK Button");

		// Prompt Alert

		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(2000);
		alert.sendKeys("Edu");
		alert.accept();
	}

}
