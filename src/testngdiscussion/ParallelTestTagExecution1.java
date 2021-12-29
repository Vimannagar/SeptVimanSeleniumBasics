package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestTagExecution1 {
	
	
	
	
	@Test
	public void navToGoogle()
	{
System.out.println("Navigating to google .com");
	}
	
	
	@Test
	public void profile()
	{
		System.out.println("Profile test case");
	}
	
	
	
	
	
}
