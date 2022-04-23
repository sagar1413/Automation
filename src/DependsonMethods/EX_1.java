package DependsonMethods;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class EX_1 {

	@Test
	public void add()
	{
		System.out.println("Addition");
	}
	
	@Test(dependsOnMethods = {"mult"})
	public void sub()
	{
		System.out.println("Substraction");
	}
	
	@Test
	public void mult()
	{
		//System.out.println("Multiplication");
		Assert.fail("Failed");

	}
}
