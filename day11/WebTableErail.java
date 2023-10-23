package week6.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//To print Train names

public class WebTableErail {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS", Keys.ENTER);
		
		WebElement toStation =driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("CBE", Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
		for (WebElement eachName : trainNames) {
			System.out.println(eachName.getText());
		}		
	}
}
