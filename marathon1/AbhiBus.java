package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[text()='Book Bus Tickets']/following::a[1]")).click();
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'highlight')]/following::a[1]")).click();
		driver.findElement(By.xpath("//a[text()= 'Search']")).click();
		
		String BusName = driver.findElement(By.xpath("//*[@class='TravelAgntNm ng-binding']")).getAttribute("Title");
		System.out.println("Selected Bus name is: " +BusName);
		driver.findElement(By.xpath("//input[@Title='SLEEPER']")).click();
		String SeatCount = driver.findElement(By.xpath("//div[@class='search-column2-col1']/p")).getText();		
		System.out.println("Available seat count is: " +SeatCount);
		
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		driver.findElement(By.xpath("//*[contains(@class, 'sleeper available')]/a")).click();
		System.out.println("Selected Seat number is: " +driver.findElement(By.xpath("//span[@id='seatnos']")).getText());
		System.out.println("Total fare is: " +driver.findElement(By.xpath("//span[@id='ticketfare']")).getText());
		
		WebElement BoardingPoint = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
		Select BP = new Select(BoardingPoint);
		BP.selectByIndex(1);
		
		WebElement DroppingPoint = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
		Select DP = new Select(DroppingPoint);
		DP.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@id='btnEnable1']")).click();
		System.out.println("Page Title is: " +driver.getTitle());
		System.out.println("Navigated to payment page");
		driver.close();
		System.out.println("Bus Ticket booking executed successfully");
	}

}
