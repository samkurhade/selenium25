package day32;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemoTC {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.blazedemo.com/");
		
		
		Select departCity = new Select( driver.findElement(By.xpath("//select[@name='fromPort']")));
		
		departCity.selectByValue("Boston");
		
        Select destCity = new Select( driver.findElement(By.xpath("//select[@name='toPort']")));
		
		destCity.selectByValue("Rome");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		// Choosing Flight with lowest price
		int rows =  driver.findElements(By.tagName("tr")).size();
//		System.out.println("Total no of rows "+(rows));
		
		Double arr[]= new Double [rows-1]; 
		for (int r = 0; r < (rows-1); r++) {
		 	String str = driver.findElement(By.xpath("//table[@class='table']//tr["+(r+1)+"]//td[6]")).getText();
		 	String part2 = str.substring(1); // to remove $ from price
//		 	System.out.println(part2);
		 	
		 	arr[r] = Double.parseDouble(part2);
		}
		
		
//		for (Double p : arr) {
//			System.out.println(p);
//		}
		Arrays.sort(arr);
		// After Sorting
//		for (Double p : arr) {
//		System.out.println(p);
//	}

		
		String lowestPrice = "$"+String.valueOf(arr[0]);
//		System.out.println(lowestPrice +"dff");
		
		for (int r = 0; r < (rows-1); r++) {
		 	String str = driver.findElement(By.xpath("//table[@class='table']//tr["+(r+1)+"]//td[6]")).getText();
		 	
		 	
		 	if (str.equals(lowestPrice)) {
		 		System.out.println("Lowest Price is "+str);
		 		driver.findElement(By.xpath("//table[@class='table']//tr["+(r+1)+"]//td[1]//input")).click();
		 		break;
			}
		 	
		}
		
		System.out.println("Filling the form...");
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Sam Kurhade");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Ashirvad Vastu, Akurdi");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("PCMC");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("411044");
		
		Select cardType = new Select(driver.findElement(By.xpath("//select[@id='cardType']")));
		cardType.selectByVisibleText("American Express");
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("563211540542");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("12");

		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2030");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("SAM KURHADE");
		driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		String actualStr = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
		String exptStr   = "Thank you for your purchase today!";
		
		if (actualStr.equals(exptStr)) {
			System.out.println("You Flight ticket has been booked successfully!!!!!");
		}
		
		driver.close();
		
	}

}
