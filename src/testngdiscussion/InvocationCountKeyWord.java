package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyWord {
	
	@Test(invocationCount = 5)
	public void testCase1()
	{
		System.out.println("Test case 1");
	}

}
