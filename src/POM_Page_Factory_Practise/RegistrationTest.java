package POM_Page_Factory_Practise;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Desktop\\Selenium Jar Files\\ChromeUpdatedApril\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void RegistrationPageTest()
	{
		RegistrationPage rp=new RegistrationPage(driver);
		
		rp.verifyFacebookSignupFooterLinks();
		rp.clickFacebookSignupLink();
		rp.verifyFacebookRegistrationPageFblogo();
		rp.verifyFacebookRegistrationPageAlreadyAccount();
		rp.setFacebookRegistrationPageFirstName();
		rp.setFacebookRegistrationPagelastName();
		rp.setFacebookRegistrationPageMobileEmail();
		rp.setFacebookRegistrationPagePassword();
		rp.setFacebookRegistrationPageBirthday();
		rp.setFacebookRegistrationPageBirthMonth();
		rp.setFacebookRegistrationPageBirthdayYear();
		
	}
	
	
	
}
