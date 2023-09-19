package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//LIST
public class ListMobilePrice {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile Phones");
				driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
				
				List<WebElement> price = driver.findElements(By.className("a-price-whole"));
				List<Integer> List = new ArrayList<>();
				
				for(WebElement each:price)
				{
					String text = each.getText();
					String replace = text.replaceAll(",", "");
					int MobilePrice = Integer.parseInt(replace);
					List.add(MobilePrice);
					}
					Collections.sort(List);
					System.out.println(List.get(0));
					
					//List to Set --> To remove duplicates (use TreeSet)
					Set<Integer> unique = new TreeSet<>(List);
					System.out.println(unique);
					
		}
}
