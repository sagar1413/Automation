package TestNG_Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario_1 {
	
	//Login--> homepage--> Logout
	//profile page-->> logout
	//notification=page-->> Logout
	
	@BeforeMethod
	public void login()
	{
		System.out.println("login to the application");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout");
	}
	
	@Test(priority=1)
	public void homepagetest()
	{
		System.out.println("Homepage tested");
	}
	
	@Test(priority=2)
	public void Profilepage()
	{
		System.out.println("Profile Page tested");
	}
	
	@Test(priority=3)
	public void notificatioboage()
	{
		System.out.println("Notification Page tested");
	}
	
	
	
	
}
