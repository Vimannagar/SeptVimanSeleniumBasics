package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestClass1Execution {
	
	
	
	
	@Test
	public void navToGoogle()
	{
System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
	WebDriver	driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	}
	
	
	@Test
	public void profile()
	{
		System.out.println("Profile test case");
	}
	
	
	
	
	
}
