package tstngRev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParalllellTest {
	@Parameters("browser")
	@Test
	public void setUp(String br) throws InterruptedException {
		WebDriver driver;
		switch (br) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("Launching Chrome browser");
			Thread.sleep(5000);
			driver.get("https://chatgpt.com/");
			break;
		case "edge":
			driver = new EdgeDriver();
			System.out.println("Launching Edge browser");
			Thread.sleep(5000);
			driver.get("https://chatgpt.com/");
			break;

		default:
			System.out.println("Invalid browser name");
			Assert.assertTrue(false);
			break;
		}
		
	}

}
