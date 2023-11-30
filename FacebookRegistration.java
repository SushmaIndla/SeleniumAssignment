package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//go to fb url
		
		driver.get("https://en-gb.facebook.com/");
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		driver.findElement(By.name("reg_email__")).sendKeys("testleaf1@gmail.com");
		
        driver.findElement(By.id("day")).sendKeys("07");
		
		driver.findElement(By.id("month")).sendKeys("07");
		
		driver.findElement(By.id("year")).sendKeys("1983");
		
		

	}

}
