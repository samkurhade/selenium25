package tstngRev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationInTessstng {
	@Parameters("browser")
	@Test
	public void setUp(String br) {
		WebDriver driver;
		switch (br) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("Launching Chrome browser");
			driver.get("https://chatgpt.com/");
			break;
		case "edge":
			driver = new EdgeDriver();
			System.out.println("Launching Edge browser");
			driver.get("https://chatgpt.com/");
			break;

		default:
			System.out.println("Invalid browser name");
			Assert.assertTrue(false);
			break;
		}
		
	}

}
