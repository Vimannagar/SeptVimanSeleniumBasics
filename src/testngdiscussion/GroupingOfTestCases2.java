package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingOfTestCases2 {
	
	@Test(groups = "Regression", priority = 1)
	public void editProfile()
	{
		System.out.println("Edit profile test case");
		
	}
	
	@Test(groups = "Sanity", priority = 2)
	public void viewProfile()
	{
		System.out.println("View Profile Test");
		
	}
	
	@Test(groups = "Regression", priority = 3)
	public void myInfo()
	{
		System.out.println("my info test");
	}
	
	
	@Test(groups = "functional", priority = 4)
	public void timeline()
	{
		System.out.println("Time line test");
	}
	
	@Test(groups = "functional", priority = 5)
	public void uploadImage()
	{
		System.out.println("upload image test case");
	}
	
	@Test(groups = "functional", priority = 6)
	public void profile()
	{
		System.out.println("profile accessibility test case");
	}

}
