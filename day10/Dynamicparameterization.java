package week6.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dynamicparameterization {

	public RemoteWebDriver driver ;
	

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
	public String[][] sendData() {
		
		String[][] data = new String[2][4];
		
		data [0][0] = "TestLeaf";
		data [0][1] = "Subraja";
		data [0][2] = "Subi";
		data [0][3] = "99";
		
		data [1][0] = "QEagle";
		data [1][1] = "Aravind";
		data [1][2] = "Ari";
		data [1][3] = "91";
		
		return data;	
	}

}
