package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddToCart {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("One Plus 9 Pro" + Keys.ENTER);
		/*
		 * WebElement SearchBox =
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 * SearchBox.sendKeys("one plus 9 pro"); SearchBox.sendKeys(Keys.ENTER);
		 */
		
		WebElement RatingEle = driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']/following::div/div/span/span"));
		String Rating = RatingEle.getText();
		System.out.println("Rating for selected mobile phone is: " +Rating);
		
		WebElement PriceEle = driver.findElement(By.xpath("//a[@class='a-size-base a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal']/span/span/span[2]"));
		String Price = PriceEle.getText();
		Price = Price.replaceAll("\\D+","");
		//Price = Price.replaceAll(",","");
		int p = Integer.parseInt(Price);
		System.out.println("Price for selected mobile phone is: " +p);
		
		String ParentTitle = driver.getTitle();
		System.out.println("Parent Title is: " +ParentTitle);
		
		driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
		Set<String> handle = driver.getWindowHandles();
		List<String> ListHandle = new ArrayList<>(handle);
		driver.switchTo().window(ListHandle.get(1));
		
		String ChildTitle = driver.getTitle();
		System.out.println("Child Title is: " +ChildTitle);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//WebElement FinalEle = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		WebElement FinalEle = driver.findElement(By.xpath("//b[text()='Cart subtotal']/following::span"));
		String FinalPrice = FinalEle.getText();
		System.out.println(FinalPrice);
		FinalPrice = FinalPrice.replaceAll(".00","");
		FinalPrice = FinalPrice.replaceAll("\\D+","");
		System.out.println(FinalPrice);
		int fp = Integer.parseInt(FinalPrice);
		System.out.println("Final Price for selected mobile phone is: " +fp);
		
		if(p==fp)
		{
			System.out.println("Same Price");
		}
		else
		{
			System.out.println("Price Varies");
		}
		
		
	}

}
