package com.Module2;

// import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwoWayCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedDay = "2";
		String expectedMonth = "March";
		String expectedYear = "2025";
		
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/hotels/");
		
		//
		driver.findElement(By.xpath("//div[@id='htl_dates']")).click();
		while(true) {
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(month.equals(expectedMonth)&&(year.equals(expectedYear))) {
				
				List<WebElement> daylist=driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement E2:daylist) {
				
					String day = E2.getText();
					if(day.equals(expectedDay)) {
						E2.click();
						break;
					}
				}
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
		
		
		

	}

}
