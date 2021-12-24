package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationActualUsage {
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("Browser get open");
	}
	
	@AfterSuite
	public void quitBrowser()
	{
		System.out.println("Browser gets shutdown");
	}
	
	@BeforeTest
	public void navToUrl()
	{
		System.out.println("Navigate to a particular Url");
	}
	
	@AfterTest
	public void backToOriginalURL() {
		System.out.println("Navigating back to the original url");
	}
	
	@BeforeClass
	public void loginToApp()
	{
		System.out.println("Logged into the application");
	}
	
	@AfterClass
	public void logoff()
	{
		System.out.println(" Logging off from the application");
	}
	
	@BeforeMethod
	public void navigateToSpecificLocation()
	{
		System.out.println("Nav to specific page");
	}

	
	@AfterMethod
	public void backToOriginalPosition()
	{
		System.out.println("Nav back to original page");
	}
	
	@Test
	public void testCase()
	{
		System.out.println("Actual test case execution");
	}

}
