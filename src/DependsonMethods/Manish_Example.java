package DependsonMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Manish_Example {

	@BeforeTest
	public void opendb() {
		System.out.println("database is opened");
	}

	@AfterTest
	public void closedb() {
		System.out.println("database is closed");
	}

	@BeforeClass
	public void openbrowser() {
		System.out.println("browser opening ");
	}

	@AfterClass
	public void closedbrowser() {
		System.out.println("browser is closed");

	}

	@Test(priority =1,dependsOnMethods = { "test2", "test3" })
	public void test1() {
		System.out.println("m1 ");
	}

	@Test(priority = 3)
	public void test2() {
		System.out.println("m2");
	}

	@Test(priority = 2, enabled = true)
	public void test3() {
		System.out.println("m3");
	}

	
}
