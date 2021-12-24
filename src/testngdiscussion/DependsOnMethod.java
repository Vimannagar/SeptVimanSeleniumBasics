package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		
	}
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void dashBoardTest()
	{
		System.out.println("Dashboard Test");
		Assert.fail();
	}
	
	@Test(priority = 3, dependsOnMethods = "dashBoardTest")
	public void checkBox()
	{
		System.out.println("checkbox test");
	}
	
	@Test(priority = 4, dependsOnMethods = {"dashBoardTest", "login" })
	public void logoff()
	{
		System.out.println("Logoff from application");
	}

}
