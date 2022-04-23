package TestNG_Keyword;

import org.testng.annotations.Test;

public class Depends_On_Keyword {
	
	@Test(priority=1)
	public void openurl()
	{
		System.out.println("url opened");
	}
	
	@Test(priority=2,dependsOnMethods = "openurl")
	public void login()
	{
		
		System.out.println("Login Successful");
	}
	
	@Test(priority=3,dependsOnMethods = {"openurl", "login"})
	public void logout()
	{
		System.out.println("Logout Successful");
	}

}
