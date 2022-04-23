package Thread_Pool_Size;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EX_1 {
	
	
	@Test (invocationCount = 5,threadPoolSize = 2)
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium Jar Files\\ChromeUpdatedApril\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}
}

