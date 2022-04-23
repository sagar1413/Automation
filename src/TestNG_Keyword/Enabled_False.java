package TestNG_Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled_False {
	
	@BeforeMethod
	public void Login() {
		System.out.println("Logged in");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logged Out");
	}
	
	@Test(priority =2, invocationCount=5, enabled= false)  // ignored by TestNG
	public void HomePage() {
		System.out.println("HomePage");
	}
	
	@Test (priority=1)
	public void Profilepage()  {
		System.out.println("ProfilePage");
	}
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser Launched");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser closed");
	}
	
}

