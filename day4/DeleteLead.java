package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("http://leaftaps.com/opentaps");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

				driver.findElement(By.xpath("//span[text()='Email']")).click();
				driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("rat00@mail.com");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
				
				String leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
				System.out.println("Lead name is: " +leadId);
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
				String record = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
				System.out.println(record);
	}

}
