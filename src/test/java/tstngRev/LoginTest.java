package tstngRev;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Inside setUP method");
	}
	@Test()
	public void loginTest() {
		System.out.println("Inside loginTest method!");
	}
	@AfterMethod
	public void CleanUp() {
		System.out.println("Inside CleanUp method!");
	}
	@BeforeClass
	public void m1() {
		System.out.println("Inside m1()");
	}
	@AfterClass
	public void m2() {
		System.out.println("Inside m2()");
	}
	@BeforeTest
	public void m3() {
		System.out.println("Inside m3()");
	}
	@AfterTest
	public void m4() {
		System.out.println("Inside m4()");
	}
	@BeforeSuite
	public void m5() {
		System.out.println("Insode m5()");
	}
	@AfterSuite
	public void m6() {
		System.out.println("Inside m6()");
	}
}
