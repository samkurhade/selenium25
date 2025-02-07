package tstngRev;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodDeps {
	
	@Test(priority = 1)
	public void setUp() {
		System.out.println("Hi I am setUp()");
		Assert.assertTrue(true);
	}
	@Test(priority = 2,dependsOnMethods = "setUp")
	public void loginTest() {
		System.out.println("Hi I am loginTest()");
		Assert.assertTrue(true);
	}
	@Test(priority = 3,dependsOnMethods = {"setUp","loginTest"})
	public void SearchTest() {
		System.out.println("Hi I am searchTest()");
	}

}
