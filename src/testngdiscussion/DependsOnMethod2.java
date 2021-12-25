package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod2 {
	
	
	@Test(priority = 100, dependsOnMethods = "testngdiscussion.DependsOnMethod.login")
	public void dashBoardTest()
	{
		System.out.println("Dashboard Test");
		
	}
	
	@Test(priority = 200, dependsOnMethods = "dashBoardTest")
	public void checkBox()
	{
		System.out.println("checkbox test");
	}
	
}
