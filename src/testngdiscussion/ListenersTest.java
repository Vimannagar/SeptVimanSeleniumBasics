package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersTest {
	
	
	@Test(priority = 1)
	public void loginTest()
	{
		System.out.println("Login test case");
		
		Assert.assertEquals(true, false);
	}
	
	
	@Test(priority = 2, dependsOnMethods = "loginTest")
	public void home()
	{
		System.out.println("Home test case");
	}
	
	
	@Test(priority = 3)
	public void profile()
	{
		System.out.println("profile test case");
	}



}
