package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCHandleWindow {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		String ptitle = driver.getTitle();
		System.out.println("Parent Window Title: " +ptitle);
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		String ctitle = driver.getTitle();
		System.out.println("Child Window Title: " +ctitle);
		
		if(ptitle.equals(ctitle))
		{
			System.out.println("Switched to Child Window by Default");
		}
		else
		{
			System.out.println("Not Switched to Child Window");
		}
		
		Set<String> setHandles = new LinkedHashSet<>();
		setHandles = driver.getWindowHandles();
		
		List<String> listHandles = new ArrayList<>(setHandles);
		driver.switchTo().window(listHandles.get(0));
		String ftitle = driver.getTitle();
		System.out.println("Current Window Title is: " +ftitle);
		
		if(ftitle.equals(ptitle))
		{
			System.out.println("Navigated Back to Parent Window");
		}
		else
		{
			System.out.println("Still in Child Window");
		}
		
	}

}
