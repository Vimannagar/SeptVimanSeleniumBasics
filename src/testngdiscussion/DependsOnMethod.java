package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		Assert.fail();
	}
	

	
	@Test(priority = 4, dependsOnMethods =  "login")
	public void logoff()
	{
		System.out.println("Logoff from application");
	}

}
