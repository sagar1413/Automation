package Test_Annotations_Ex_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_1 {

	
		//1) open db
		//2) close db
	
	@BeforeTest 
	public void open_db()
	{
	System.out.println("Database Opened");
	}
	
	@AfterTest
	public void close_db()
	{
		System.out.println("Database Closed");
	}
	@Test
	public void m1()
	{
		System.out.println("This is m1");
	}
	@Test
	public void m2()
	{
		System.out.println("This is m2");
	}
}
