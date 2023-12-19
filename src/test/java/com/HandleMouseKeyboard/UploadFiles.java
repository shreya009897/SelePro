package com.HandleMouseKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/upload-download");
	     WebElement e1 = driver.findElement(By.id("uploadFile"));
	     e1.sendKeys("D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\src\\test\\java\\com\\NewDemo\\Locators.java");
	    
	
	
	     
	
	}

}
