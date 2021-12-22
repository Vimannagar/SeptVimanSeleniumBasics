package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyword {
	
	@Test(priority = -1000, enabled = true)
	public void login()
	{
//		System.out.println("Login test case");
		
		Reporter.log("Login test case", true);
	}
	
	
	@Test(priority = 200)
	public void home()
	{
//		System.out.println("Home test case");
		Reporter.log("Home test case", true);
	}
	
	
	@Test(priority = 300)
	public void dashBoard()
	{
//		System.out.println("Dashboard test case");
		Reporter.log("Dashboard test case", true);
		
		
	}

	@Test(priority = 100)
	public void logout()
	{
//		System.out.println("logout test case");
		Reporter.log("logout test case", true);
		
	}
	
	
	@Test
	public void profile()
	{
//		System.out.println("profile test case");
		
		Reporter.log("profile test case", true);
	}
	
	
	@Test(priority = 100)
	public void passwordChange()
	{
//		System.out.println("password change test case");
		Reporter.log("password change test case", true);
	}

}
