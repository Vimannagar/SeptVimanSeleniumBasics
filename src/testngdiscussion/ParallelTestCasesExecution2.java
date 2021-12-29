package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestCasesExecution2 {
	
	
	
	
	@Test
	public void navToOrangeHRM()
	{
System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
	WebDriver	driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/");
	}
	
	
	@Test
	public void navToLinkedin()
	{
		
System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
	}
	
	
	
	
}
