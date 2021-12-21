package testngdiscussion;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = -1000)
	public void login()
	{
		System.out.println("Login test case");
	}
	
	
	@Test(priority = 200)
	public void home()
	{
		System.out.println("Home test case");
	}
	
	
	@Test(priority = 300)
	public void dashBoard()
	{
		System.out.println("Dashboard test case");
	}

	@Test(priority = 100)
	public void logout()
	{
		System.out.println("logout test case");
	}
	
	
	@Test
	public void profile()
	{
		System.out.println("profile test case");
	}
	
//	@Test(priority = 1.2)// priority cannnot be in decimal
//	public void passwordChange()
//	{
//		System.out.println("password change test case");
//	}

	
	@Test(priority = 100)
	public void passwordChange()
	{
		System.out.println("password change test case");
	}

}
