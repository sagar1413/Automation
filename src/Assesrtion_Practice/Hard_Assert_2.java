package Assesrtion_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_2 {
	
	@Test  // hard assert.
	public void sample1() {
		
		String str1 = "Hello";
		Assert.assertEquals(str1, "Hi");      // fail
		System.out.println(str1);
		
		String str2 = "Hi";
		Assert.assertEquals(str2, "Hi");      // pass
		System.out.println(str2);
	}
	
	@Test
	public void sample2() {
		System.out.println("Automation");
	}


}
