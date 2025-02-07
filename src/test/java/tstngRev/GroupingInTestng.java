package tstngRev;

import org.testng.annotations.Test;

public class GroupingInTestng {
	
	@Test(groups = {"sanity"})
	public void setUp() {
		System.out.println("I am setUp()");
	}
	
	@Test(groups = {"sanity"})
	public void loginByMeta() {
		System.out.println("I am loginByMeta()");
	}
	@Test(groups = {"sanity","regression"})
	public void loginByIg() {
		System.out.println("I am loginByIg()");
	}
	@Test(groups = {"regression"})
	public void loginByX() {
		System.out.println("I am loginByX()");
	}
	
	@Test(groups = {"sanity"})
	public void logOut() {
		System.out.println("I am logOut()");
	}
	
}
