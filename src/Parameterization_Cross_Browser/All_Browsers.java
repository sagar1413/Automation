package Parameterization_Cross_Browser;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class All_Browsers {

	WebDriver driver;

	@Parameters("browser")
	@Test(priority = 1)
	public void crossbrowsertesting(String broswer) {
		if (broswer.equalsIgnoreCase("chrome")) {
			// code to launch chrome browsers
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lenovo\\Desktop\\Selenium Jar Files\\ChromeUpdatedApril\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (broswer.equalsIgnoreCase("ie")) {
			// code to launch chrome firefox
			System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Desktop\\Selenium Jar Files\\edgedriver_win64\\msedgedriver.exe ");
			driver =new EdgeDriver();
		}
	
	
	driver.get("https://www.facebook.com/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
		public void verifyurl()
		{
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
			
		}

}

