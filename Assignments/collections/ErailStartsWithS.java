package collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailStartsWithS {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS", Keys.TAB);

		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("SBC", Keys.TAB);

		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();

		List<WebElement> trainNumbers = driver
				.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[1]/a");
		List<WebElement> trainNames = driver
				.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]");

		Map<String, String> map = new TreeMap<String, String>();

		for (int i = 0; i < trainNumbers.size(); i++) {
			String textNames = trainNames.get(i).getText();
			String textNums = trainNumbers.get(i).getText();
			if (textNames.startsWith("S")) {
				map.put(textNames, textNums);
			}
		}

		System.out.println(map);
	}

}
