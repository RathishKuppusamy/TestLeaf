package week6.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	public RemoteWebDriver driver ;
	
	@Parameters({"browser", "url", "username", "password"})
	
	@Test
	public void CreatingLeads(String browser, String url, String uname, String pword) {
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		/*
		 * else if(browser.equalsIgnoreCase("InternetExplorer")) { driver = new
		 * InternetExplorerDriver(); }
		 */
		else
		{
			System.out.println("Driver Not Available");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
