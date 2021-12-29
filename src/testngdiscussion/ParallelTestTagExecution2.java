package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestTagExecution2 {
	
	
	
	
	@Test
	public void navToFlipkart()
	{
System.out.println("Navigating to flipkart .com");
	}
	
	
	@Test
	public void dashBoard()
	{
		System.out.println("dashboard test case");
	}
	
	
	
	
	
}
