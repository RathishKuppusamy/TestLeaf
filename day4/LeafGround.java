package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
	
		  driver.findElement(By.xpath("//*[text()='Type your name']/following::input[1]")).
		  sendKeys("Rathish Kuppusamy"); System.out.println("Name Entered");
		  
		  driver.findElement(By.xpath("//*[text()='Append Country to this City.']/following::input[1]")).sendKeys("India"); 
		  System.out.println("Country name appended");
		  
		  System.out.print("Is Text box Disabled? " ); boolean enabled =
		  driver.findElement(By.xpath("//*[text()='Verify if text box is disabled']/following::input[1]")).isEnabled(); 
		  if(enabled==true) 
		  { 
			  System.out.println("It's Enabled"); 
		  } 
		  else 
		  {
		  System.out.println("It's Disabled"); 
		  }
		  
		  driver.findElement(By.xpath("//*[text()='Clear the typed text.']/following::input[1]")).clear();
		  System.out.println("Text box is cleared");
		  
		  String retrieve = driver.findElement(By.xpath("//*[text()='Retrieve the typed text.']/following::input[1]")).
		  getAttribute("value"); System.out.println("Retrieved Text is: " + retrieve);
		  
		  WebElement email = driver.findElement(By.xpath("//*[contains(text(), 'Type email and Tab.')]/following::input[1]"));
		  email.sendKeys("Sampleemail@email.com");
		  System.out.println("Email is entered"); email.sendKeys(Keys.TAB);
		  
		  WebElement intro = driver.findElement(By.xpath("//*[text() = 'Type about yourself']/following::textarea")); 
		  boolean cursorMoved = intro.isEnabled(); 
		  if(cursorMoved == true)
		  {
		  intro.sendKeys("Iam a student in Test Leaf");
		  System.out.println("Updated about myself"); 
		  } 
		  else 
		  {
		  System.out.println("Cursor not moved"); 
		  }
		  
		  driver.findElement(By.xpath("//*[text() = 'Text Editor']//following::div[6]")).sendKeys("Text goes here"); 
		  System.out.println("Text editor completed");
		  driver.findElement(By.xpath("//*[@class='ql-list'][1]")).click();
		  System.out.println("Bullet list applied");
		  
		  WebElement error = driver.findElement(By.xpath("//*[contains(text(),'confirm error message')]/following::input[2]"));
		  error.sendKeys(Keys.ENTER); boolean age =
		  driver.findElement(By.xpath("//span[text()='Age is mandatory']")).isDisplayed
		  (); if(age==true) { System.out.println("Error occurs!!!!! Age is mandatory");
		  } else { System.out.println("No Error"); }
		  
		  Point label1 =
		  driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		  System.out.println(label1); driver.findElement(By.xpath("//*[text()='Click and Confirm Label Position Changes']/following::input[1]")).click(); 
		  Point label2 =
		  driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		  System.out.println(label2);
		  
		  if(label1==label2) { System.out.println("Label not moved"); } else {
		  System.out.println("Label Moved"); }
		  
		  
		  driver.findElement(By.xpath("//input[contains(@id,'auto-complete_input')]")).sendKeys("Ratis"); 
		  driver.findElement(By.xpath("//*[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li[3]")) .click(); 
		  System.out.println("Selected 3rd option");
		  
		  driver.findElement(By.xpath("//*[text()='Click and Confirm Keyboard appears']/following::input[1]")).click(); 
		  boolean keyboard = driver .findElement(By.xpath("//div[contains(@class,'ui-widget ui-widget-content ui-corner-all ui-shadow keypad')]")) .isDisplayed(); 
		  if (keyboard == true) 
		  {
		  System.out.println("Keypad is appeared"); 
		  } 
		  else 
		  {
		  System.out.println("Keypad not appeared"); 
		  }
		 
		
		driver.findElement(By.xpath("//*[text()='Custom Toolbar']//following::span//button[2]")).click();
		driver.findElement(By.xpath("//*[text()='Custom Toolbar']//following::div[4]")).sendKeys("Enter text in custom toolbar");
		System.out.println("Text entered in Italics in custom toolbar");
		
		System.out.println("Assignment completed successfully");
	}
}