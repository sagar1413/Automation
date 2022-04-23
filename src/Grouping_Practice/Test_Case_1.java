package Grouping_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case_1 {
	
	@BeforeTest(alwaysRun = true)
	public void opendb()
	{
		System.out.println("Database Opened");
	}
	
	@AfterTest(alwaysRun = true)
	public void closedb()
	{
		System.out.println(" Database Closed");
	}
	
	@BeforeClass(alwaysRun = true)
	public void openbrowser()
	{
		System.out.println("Browser Opened");
	}
	
	@AfterClass(alwaysRun = true)
	public void closebrowser()
	{
		System.out.println("Browser Closed");
	}
	
	
	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("Test 1 ");
	}
	
	@Test(groups = {"functional","regression"})
	public void test2()
	{
		System.out.println("Test 2 ");
	}
	
	@Test(groups =  "regression")
	public void test3()
	{
		System.out.println("Test 3 ");
	}

}
