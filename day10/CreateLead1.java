package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead1  {

		@Test(dataProvider="fetchData")
		public void CreatingLeads(String cname, String fname, String lname, String ph) {
			
			
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
			driver.findElement(By.name("submitButton")).click();
			String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			if (text.contains("Testleaf")) {
				System.out.println("Lead created successfully");
			}
			else {
				System.out.println("Lead is not created");
			}
		}
		
		@DataProvider(name= "fetchData")
		public String[][] sendData() throws IOException {
			
			return PassExcelValue.readExcel();
			
		}

	}
