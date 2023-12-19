package com.Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFrame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Go to parent frame
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		
		// Go to child frame and click on check box
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		// go to parent Frame give the input
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("hello");
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement e1 = driver.findElement(By.id("animals"));
		Select sc = new Select(e1);
		sc.selectByVisibleText("Avatar");	
		
	}

}
