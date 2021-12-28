package testngdiscussion;

import org.testng.annotations.Test;

public class TestCasesForFailedExecution {
	
	
	@Test(dependsOnMethods = "testngdiscussion.SoftAssertDisc.testCase1")
	public void loginTest()
	{
		System.out.println("Login test case");
	}
	
	
	@Test
	public void home()
	{
		System.out.println("Home test case");
	}
	
	
	@Test
	public void a()
	{
		System.out.println("A test case");
	}


}
