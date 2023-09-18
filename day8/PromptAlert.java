package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//*[text()=' Alert (Prompt Dialog)']/following::button")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Ratis");
		alert.accept();
		String verify = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		if(verify.contains("entered name"))
		{
			System.out.println("Alert is verified");
		}

	}

}
