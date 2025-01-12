package day35;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTC1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		// To choose current date
//		int date = 12;
//		driver.findElement(By.xpath("//a[@data-date='"+date+"']")).click();

		
		
		
		/*
		// To choose previous date

		String yr = "2024";
		String month = "March";
		String dt = "12";

		while (!(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().equals(yr)
				& driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equals(month))) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		
		List<WebElement> datesList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		
		for (WebElement date : datesList) {
			if(date.getText().equals(dt))
				date.click();
		}
		*/
		
		/*
		// To choose upcoming datex

		String yr = "2027";
		String month = "December";
		String dt = "5";

		while (!(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().equals(yr)
				& driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equals(month))) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		
		List<WebElement> datesList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		
		for (WebElement date : datesList) {
			if(date.getText().equals(dt))
				date.click();
		}
		*/
		

		
		
		}
	}

