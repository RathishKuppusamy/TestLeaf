package week2.day2;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ratis");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("K");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("7896541230");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password");
		
		//drop down
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select day1 = new Select(day);
		Select month1 = new Select(month);
		Select year1 = new Select(year);
		
		day1.selectByVisibleText("28");
		month1.selectByVisibleText("Jul");
		year1.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
		
		System.out.println("Values entered successfully");
	}

}
