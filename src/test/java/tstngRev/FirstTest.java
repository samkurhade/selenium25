package tstngRev;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(priority = -1)
	public void setup() {
		System.out.println("Inside setup method!");
	}
	@Test()
	public void loginTest() {
		System.out.println("Inside loginTest method!");
	}
	@Test(priority = 3)
	public void CleanUp() {
		System.out.println("Inside CleanUp method!");
	}
}
