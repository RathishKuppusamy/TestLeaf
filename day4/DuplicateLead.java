package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
				
				String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
				System.out.println("Lead name is: " +name);
				
				driver.findElement(By.xpath("//a[text()='Ratis']")).click();
				driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
				
				driver.findElement(By.xpath("//title[contains(text(),'Duplicate Lead')]"));
				String title = driver.getTitle();
				String expectedTitle = "Duplicate Lead | opentaps CRM";
				if(title.equals(expectedTitle)) {
					System.out.println("Title verified");
				}
				else {
					System.out.println("Unable to verify title");
				}
						
				driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
				
				String duplicateName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
				if(name.equals(duplicateName))
				{
					System.out.println("Duplicate name matches with the original name");
				}
				else
				{
					System.out.println("Duplicate name doesnot match with the original name");
				}

	}

}
