package Assesrtion_Practice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Practice {

	String str1 = "sagar";
	String str2 = "ghodke";

	// assertEquals : check actual vs expected, if both results are
	// same then test case pass otherwise it fails

	@Test // Fails
	public void test1() {
		Assert.assertEquals(str1, str2);
	}

	/*
	 *  assertNotEquals : check actual vs expected, if both results are
	 *  Not same then test case pass otherwise it fails
	 */

	@Test
	public void test2() {
		Assert.assertNotEquals(str1, str2);
	}
	
	/*
	 *  assertNull: check actual vs expected, if both results are
	 *  Not same then test case pass otherwise it fails
	 */
	
	@Test
	public void test3() {
		Assert.assertNull(str1);
	}
	
	@Test
	public void test4() {
		Assert.assertNotNull(str2);
	}
}
