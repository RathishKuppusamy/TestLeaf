package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		
		WebElement Dropdown1 = driver.findElement(By.xpath("//select[@name='city']"));
		Select city = new Select(Dropdown1);
		city.selectByVisibleText("Chennai");
		
		WebElement Dropdown2 = driver.findElement(By.xpath("//select[@name='genre']"));
		Select genre = new Select(Dropdown2);
		genre.selectByVisibleText("ANIMATION");
		
		WebElement Dropdown3 = driver.findElement(By.xpath("//select[@name='lang']"));
		Select language = new Select(Dropdown3);
		language.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
		//driver.findElement(By.xpath("//img[@src='https://originserver-static1-uat.pvrcinemas.com/app/movies/1/402x516/HO00018056.jpg?v=10']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		WebElement Cinema0 = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select Cinema = new Select(Cinema0);
		Cinema.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
		
		WebElement Showtime0 = driver.findElement(By.xpath("//select[@name='timings']"));
		Select Showtime = new Select(Showtime0);
		Showtime.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rat");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sampleemail@email.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7896541231");
		
		WebElement Food0 = driver.findElement(By.xpath("//select[@name='food']"));
		Select Food = new Select(Food0);
		Food.selectByValue("Yes");
		
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("nothing");
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary-white']/following::button[7]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		System.out.println("Page Title is: " +driver.getTitle());
		
		System.out.println("PVR Movie Ticket is succesfully booked");
		
		
		
		
		
	}

}
