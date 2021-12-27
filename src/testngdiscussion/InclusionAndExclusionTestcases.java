package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class InclusionAndExclusionTestcases {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("opening the browser");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class annotation");
	}
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		
	}
	
	@Test(priority = 2 )
	public void logoff()
	{
		System.out.println("Logoff  testcase");
	}
	
	

	@Test(priority = 3 )
	public void home()
	{
		System.out.println("home testcase");
	}
	
	@Test(priority = 4 )
	public void profile()
	{
		System.out.println("profile testcase");
	}

}
