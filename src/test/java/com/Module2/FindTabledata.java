package com.Module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindTabledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/tanma/Desktop/table.html");
//          WebElement E1 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
//          System.out.println(E1.getText());
        
// How to count No. of rows in a table
 //        List<WebElement> E1 = driver.findElements(By.xpath("//table/tbody/tr"));
 //        System.out.println(E1.size());
        
// How to count No.of column in a table
        List<WebElement> E1 = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		 System.out.println(E1.size());
		
// How to display all items in a table
	  List<WebElement> Row = driver.findElements(By.xpath("//table/tbody/tr"));
        int r = Row.size();
        
        
        List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
                int c = col.size();
 
       for(int i=2; i<=r; i++) {
        	
       
        for(int j=1;j<=c;j++) {
        
		String s = driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td["+ j +"]")).getText();
		System.out.println(s);
        }
        }
 }
} 

