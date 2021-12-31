package pomtest;

import org.testng.annotations.Test;

import pompage.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginToApp()
	{
		
		lp.loginWithCredentials();
		
	}

}
