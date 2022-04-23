package TestNG_Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocation_Count {
	
	@BeforeClass
	public void LaunchBrowser()
	{
		System.out.println("Browser is launched");
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("Browser is Closed");
	}
	
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login Successfull");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout Successfull");
	}
	
	@Test(priority=1)
	public void HomepageTest()
	{
		System.out.println("*****Homepage Tested*********");
	}
	
	@Test(priority=2,invocationCount = 2)
	public void ProfilepageTest()
	{
	System.out.println("Profilepage Tested");	
	}

}
