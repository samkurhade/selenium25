package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerTC2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		String yr = "2031";
		String mn = "Mar";
		String dt = "31";
		
		Select year = new Select( driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		year.selectByValue(yr);
		
		Select month = new Select( driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		month.selectByVisibleText(mn);
		
		
		//table[@class='ui-datepicker-calendar']//tbody//tr[5]//td[5]
		
	    int noOFRows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr")).size();
		int noOFCols = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[1]//td")).size();
	    
	    for (int r = 1; r <= noOFRows; r++) {
			for (int c = 1; c < noOFCols ; c++) {
				if (driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr["+r+"]//td["+c+"]")).getText().equals(dt)) {
					driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr["+r+"]//td["+c+"]")).click();
				}
			}
			
		}
	    System.out.println("Completd");
	    driver.close();

	}

}
