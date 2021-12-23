package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNG2 {
	
	
	
//	 to execute prior to the execution of any thing available in the class
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class annotation class2");
	}
	
	
	// To execute prior to every test case
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method class2 ");
	}

	
	@Test(priority = 2)
	public void testCase3()
	{
		System.out.println("Actual test case 3");
	}
	
	@Test(priority = 1)
	public void testCase4()
	{
		System.out.println("Actual test case 4");
	}
	
	// To execute post to the execution of every test case
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method class2");
	}

	//	 to execute post to the execution of any thing available in the class
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class annotation class2");
	}
	

	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test annotation from Class2");
	}
}
