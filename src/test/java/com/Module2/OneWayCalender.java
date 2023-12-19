package com.Module2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OneWayCalender {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String expectedDay = "2";
		String expectedMonth = "May";
		String expectedYear = "2025";
		
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// 1st select the frame
		WebElement E = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(E);
		
		// click on date field
		WebElement E1 = driver.findElement(By.id("datepicker"));
		E1.click();
		
		while(true)
		{
		String Actualmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String Actualyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(Actualmonth.equals(expectedMonth)&&(Actualyear.equals(expectedYear)))
			
			
		{
			
		List<WebElement>daylist=driver.findElements(By.xpath("//table/tbody/tr/td"));
		
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
