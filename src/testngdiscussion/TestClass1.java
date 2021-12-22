package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void loginWithCorrectCredentials()
	{
//		System.out.println("Login test case");
		
		Reporter.log("Login test case with correct credentials", true);
	}
	
	
	@Test
	public void loginWithIncorrectCredentials()
	{
//		System.out.println("Home test case");
		Reporter.log("Login test case with incorrect credentials", true);
	}
	

}
