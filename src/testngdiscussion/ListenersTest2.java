package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersTest2 {
	static WebDriver driver;
	
	@Test(priority = 1)
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Addmin");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
WebElement message = driver.findElement(By.xpath("//*[@id='spanMessage']"));
		
		String messagestring = message.getText();
		
		System.out.println(messagestring);
		
		String expected = "Invalid Credentiials";
		
		Assert.assertEquals(messagestring, expected);
		
		
	}
	
	
	@Test(priority = 2, dependsOnMethods = "loginTest")
	public void home()
	{
		System.out.println("Home test case");
	}
	
	
	@Test(priority = 3)
	public void profile()
	{
		System.out.println("profile test case");
	}



}
