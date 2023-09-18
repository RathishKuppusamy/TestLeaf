package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MergeLead {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		String handle0 = driver.getWindowHandle();
		System.out.println("Parent Window: " +handle0);
		String title0 = driver.getTitle();
		System.out.println("Parent Window Title is: " +title0);
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a[1]/img")).click();
			Set<String> windowHandle1 = driver.getWindowHandles();
			List<String> lWindowHandle1 = new ArrayList<>(windowHandle1);
		driver.switchTo().window(lWindowHandle1.get(1));
			String handle1 = driver.getWindowHandle();
			System.out.println("Child Window 1: " +handle1);
			String title1 = driver.getTitle();
			System.out.println("Child Window 1 Title is: " +title1);
		driver.findElement(By.xpath("//*[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a")).click();
		driver.switchTo().window(handle0);
		
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::a[1]/img")).click();
			Set<String> windowHandle2 = driver.getWindowHandles();
			List<String> lWindowHandle2 = new ArrayList<>(windowHandle2);
		driver.switchTo().window(lWindowHandle2.get(1));
			String handle2 = driver.getWindowHandle();
			System.out.println("Child Window 2: " +handle2);
			String title2 = driver.getTitle();
			System.out.println("Child Window 2 Title is: " +title2);
		driver.findElement(By.xpath("//*[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a")).click();
		driver.switchTo().window(handle0);
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String ftitle = driver.getTitle();
		System.out.println("The Final Title is " +ftitle);
	}
}
