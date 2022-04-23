package Grouping_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case_2 {

	@BeforeClass(alwaysRun = true)
	public void openbrowser() {
		System.out.println("Browser Opened");
	}

	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		System.out.println("Browser Closed");
	}

	@Test(groups = "smoke")
	public void test4() {
		System.out.println("Test 4 ");
	}

	@Test(groups = "functional")
	public void test5() {
		System.out.println("Test 5 ");
	}

	@Test
	public void test6() {
		System.out.println("Test 6 ");
	}

}
