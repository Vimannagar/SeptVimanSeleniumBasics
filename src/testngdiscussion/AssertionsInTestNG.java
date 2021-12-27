package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	
	@Test
	public void urlTest()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	// redirecting to a URL
	driver.manage().window().maximize();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	
	
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
	String url = driver.getCurrentUrl();
	
	boolean ispresent = url.contains("dashboardd");
	
	Assert.assertTrue(ispresent, "Test case is failed please file a bug");
	
	System.out.println("Last line of test case");
	

		
	}

}
