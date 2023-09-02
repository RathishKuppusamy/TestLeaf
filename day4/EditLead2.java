package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead2 {

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
		driver.findElement(By.xpath("//*[text()='Name and ID']/following::div[12]/input")).sendKeys("Ratis");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Ratis']")).click();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement compName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		compName.clear();
		compName.sendKeys("Capgemini");

		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Boolean displayed = driver.findElement(By.xpath("//span[contains(text(), 'Capgemini')]")).isDisplayed();
		if(displayed==true)
		{
			System.out.println("Company name is changed");
		}
		else
		{
		System.out.println("Company name is not changed");	
		}
		
		System.out.println("Lead Edited Successfully");

	}

}
