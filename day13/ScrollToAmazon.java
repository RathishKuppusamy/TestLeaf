package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollToAmazon {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement footer = driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine navFooterCopyright']"));
		Actions scroll = new Actions(driver);
		scroll.scrollToElement(footer).perform();
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\TestLeaf\\Selenium\\src\\main\\java\\week7\\day1\\snap.png");
		FileUtils.copyFile(src, dest);
		
	}

}
