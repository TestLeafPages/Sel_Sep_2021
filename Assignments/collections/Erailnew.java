package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailnew {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
	
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		List<WebElement> trainNumbers = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[1]");
		List<WebElement> trainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]");
		//List<WebElement> train6 = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[3]");

		
		Map<Integer, String> trains = new HashMap <Integer, String>();
		for (int i = 0; i < trainNumbers.size(); i++) {
			//System.out.println(trainNumbers.get(i).getText());
			//System.out.println(trainNames.get(i).getText());
			Thread.sleep(2000);
			String numbers = trainNumbers.get(i).getText().replaceAll("\\D","");
			String names = trainNames.get(i).getText();
		int numbInt = Integer.parseInt(numbers);
			 trains.put(numbInt, names);
			
		}
		int maxAmount = Integer.MIN_VALUE;
for (Entry<Integer, String> eachTrain : trains.entrySet()) {
	Integer amount = eachTrain.getKey();
	if (maxAmount<amount) {
		maxAmount = amount;
	}
}System.out.println(maxAmount);
for (Entry<Integer, String> eachTrain : trains.entrySet()) {
	Integer amount = eachTrain.getKey();
	if (amount == maxAmount) {
		System.out.println(eachTrain.getValue());
		
	}
	
}
driver.close();
	}
	}
