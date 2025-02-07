package tstngRev;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserttionsInJavaa {

	
	// Using Hard Asset
//	@Test
//	public void loginTest() {
//		System.out.println("Hi I am loginTest method!");
//		System.out.println("HHHHHHHHHH");
//		Assert.assertEquals("SAM", "SAMEER");
//		
//		System.out.println("At the end of loginTest method!");
//	}
//	
	
	// Using Hard Asset
	@Test
	public void loginTest() {
		System.out.println("Hi I am loginTest method!");
		System.out.println("HHHHHHHHHH");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("SAM", "SAMEER","Strings are different!");
		
		System.out.println("At the end of loginTest method!");
		
		sa.assertAll();
	}
	
}
