package Grouping_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case_3 {

	@BeforeClass(alwaysRun = true)
	public void openbrowser() {
		System.out.println("Browser Opened");
	}

	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		System.out.println("Browser Closed");
	}

	@Test(groups = "smoke")
	public void test7() {
		System.out.println("Test 7 ");
	}

	@Test(groups = "functional")
	public void test8() {
		System.out.println("Test 8 ");
	}

	@Test
	public void test9() {
		System.out.println("Test 9 ");
	}

}
