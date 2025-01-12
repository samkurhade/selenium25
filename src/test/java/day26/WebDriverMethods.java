package day26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverMethods {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sameer");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("skurhade@gmail.com");
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7854659841");
	driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Ashirvad Vastu, Gurudwara Chowk, PCMC");
	driver.findElement(By.xpath("//input[@id='male']")).click();
//	driver.findElement(By.xpath("//input[@id='sunday']")).click();
	List<WebElement> days =  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	System.out.println(days.size());
	
	for (WebElement day : days) {
//		System.out.println(day.getAttribute("value"));
		if(day.getAttribute("value").equals("monday") || day.getAttribute("value").equals("thursday"))
			day.click();
	}
	
	Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
	
	
//	List<WebElement> countries =  country.getOptions();
//	System.out.println(countries.size());
//	
//	for (WebElement cntry : countries) {
//		if(cntry.getText().equals("India"));
//		cntry.click();
//	}
	
	Thread.sleep(2000);
//	driver.close();

	
}
}
