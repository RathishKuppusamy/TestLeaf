package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		
		String Result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")).getText();
		String Result2 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]")).getText();
		System.out.println("Search result count is: " +Result +Result2);
		
		driver.findElement(By.xpath("//*[@aria-label='Skybags']/span/a/div")).click();
		driver.findElement(By.xpath("//*[@aria-label='American Tourister']/span/a/div")).click();
		
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		String BagName = driver.findElement(By.xpath("//*[@class='a-size-mini s-line-clamp-1']/span[1]")).getText();
		String BagPrice = driver.findElement(By.xpath("//*[@class='a-price']/span/span[2]")).getText();
		System.out.println("Bag Name is: " +BagName);
		System.out.println("Discounted Bag Price is: " +BagPrice);
		
		System.out.println("Page Title is: " +driver.getTitle());
		driver.quit();
		
		System.out.println("Amazon order is executed successfully");
				
	}

}
