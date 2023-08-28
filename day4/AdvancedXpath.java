package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		//NYKAA
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		//Parent-->Child
		driver.findElement(By.xpath("//form[contains(@class,'css')]/input")).sendKeys("Shirt");
		
		//Child-->Parent 
		//driver.findElement(By.xpath("//input[contains(@name,'search')]/parent::form")).sendKeys("Shirt");
		
		driver.findElement(By.xpath("//div[@class='css-1q0ywzx']/div[1]/div/button[1]")).click();
		System.out.println("NYKAA Executed Succesfully");
		
		//AJIO
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		//GP-->GC
		driver.findElement(By.xpath("//div[@class='scb']//input")).sendKeys("Shoe");
		//GC-->GP
		//driver.findElement(By.xpath("//input[@name='searchVal']//ancestor::form")).sendKeys("Shoe");
		
		driver.findElement(By.xpath("//button[contains(@class,'button')]")).click();
		System.out.println("AJIO Executed Successfully");
		
	}

}
