package com.Module2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RemoteClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		

WebElement e1 = driver.findElement(By.id("uploadFile"));
	Actions act = new Actions(driver);
	act.click(e1).perform();
	
	Robot rb = new Robot();
	rb.delay(2000);
	
	StringSelection Copy = new StringSelection("C:\\Users\\tanma\\Desktop\\Aprl Pihu.pdf");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Copy, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	
	// KeyRealese
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	}

}
