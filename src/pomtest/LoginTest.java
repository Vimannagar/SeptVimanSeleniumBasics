package pomtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pompage.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
	public void loginToApp()
	{
		
		lp.loginWithCredentials();
		lp.enterPin();
		
	}
	
	
	
	@Test(priority = 2)
	public void validatePage()
	{
		boolean returnedvalue = lp.verifyUrl();
		
		Assert.assertTrue(returnedvalue);
	}

}
