package com.AlertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// simple alert - display infrmation and warning.
		// confirmation Alert - Ask permission accept or dismiss
		// Prompt Alert - Ask some input from the user and accept
		
		
		
	System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("alertbox")).click();
		//driver.findElement(By.linkText("Alert box")).click();
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(2000);
		 driver.switchTo().alert().dismiss();
		 
//    	Alert A = driver.switchTo().alert();
//		System.out.println(A.getText());
		
	}

}
