package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingOfTestCases {
	
	@Test(groups = "Sanity", priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		
	}
	
	@Test(groups = "Regression", priority = 2)
	public void dashBoardTest()
	{
		System.out.println("Dashboard Test");
		
	}
	
	@Test(groups = "Regression", priority = 3)
	public void checkBox()
	{
		System.out.println("checkbox test");
	}
	
	
	@Test(groups = "Sanity", priority = 4)
	public void logoff()
	{
		System.out.println("Logoff from application");
	}
	
	@Test(groups = "Sanity", priority = 5)
	public void home()
	{
		System.out.println("home test case");
	}
	
	@Test(groups = "functional", priority = 6)
	public void profile()
	{
		System.out.println("profile accessibility test case");
	}

}
