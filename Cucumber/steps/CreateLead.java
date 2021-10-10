package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{

	//public ChromeDriver driver;

	
	@When("Click on {string} link")
	public void clickLink(String linkText) {
		System.out.println(driver);
		driver.findElement(By.xpath("//a[contains(text(),'" + linkText + "')]")).click();

	}

	@Then("{string} Page should be displayed")
	public void verifyPage(String pageName) {
		System.out.println(pageName + " is displayed");

	}

}
