package week3.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
		
			//go to leaftaps url
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
				
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.className("crmsfa")).click();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	   //driver.findElement(By.xpath("//input[@name='companyName']")).click();
	   
	   driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sushma");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("allam");
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("zee");
		
		//- Enter the Department Field Using any Locator of Your Choice.
		   
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Technology");
		
	   	
		//- Enter the Description Field Using any Locator of your choice.
		
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Technology description");
		

		//- Enter the ph number
		
		 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("626");
			
			
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("1234567");
		
		
		//- Enter your email in the E-mail address Field using the locator of your choice.
		
		  driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("123@testleaf.com");
		
		 		  
		//- Select State/Province as NewYork Using Visible Text.
		
		  Select Stdropdown = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")));
		  
		  Stdropdown.selectByVisibleText("New York");
		  		  		  
		//  Select objSelect =new Select(driver.findElement(By.id("search-box")));
		//  objSelect.selectByVisibleText("Automation");
		  driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Important Description");
		  ////textarea[@name='importantNote']
		  
		  driver.findElement(By.xpath("//input[@value='Update']")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  String s = driver.getTitle();
		  	System.out.println("Title of the page" +s);	
		  	driver.close();
		  	
		  	}

}

