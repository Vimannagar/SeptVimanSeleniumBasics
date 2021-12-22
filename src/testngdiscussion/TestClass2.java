package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public void urlValidation()
	{
//		System.out.println("Login test case");
		
		Reporter.log("URL validation over home page", true);
	}
	
	
	@Test
	public void profileSection()
	{
//		System.out.println("Home test case");
		Reporter.log("Profile section of home page", true);
	}
	

}
