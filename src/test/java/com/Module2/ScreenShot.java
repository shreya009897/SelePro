package com.Module2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
				
/* for screenshots we use the interface TakeScreenShot, and its parent interface searchContext.
 TakescreenShot has only one method 
 Selenium automation capture screenshot during run time
 Full Page screenShot
 Capture particular Section
 Capture particular element
		
 first you have to create reference variable, then reference variable will call their method which
 is "getScreenshotAs()"  method keep somet ype of input like (OutputType.File) , then create file and then copy 		

 As we see Webdriver and Takescreenshot both are interface and both are implemented by Remote Webdriver ,
 and we know that chromedriver can also implement the webdriver methods and also TakeScreenshot methods  */		
		
//1.) How to take screenshot of Visible element on full page
//		driver.get("https://www.google.com/");
//		TakesScreenshot act = ((TakesScreenshot)driver);
//		File s = act.getScreenshotAs(OutputType.FILE);
//		File d = new File("D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\ScreenShot1/Sct.png");
//		FileUtils.copyFile(s, d);
		
		
/*Search contextext extends => TakeScreenshot extends => Webelement implements => RemoteWebElemnent*/
		
//2.) How to take Screenshot of particular section on current page
//		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
//		WebElement E1 = driver.findElement(By.id("frame1"));
//		File s = E1.getScreenshotAs(OutputType.FILE);
//		File d = new File ("D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\ScreenShot1/web1.png");
//		FileUtils.copyFile(s, d);
		 
		
// 3.)How to take screenshot of particular webelement
		driver.get("https://nxtgenaiacademy.com/alertandpopup");
		WebElement E1 = driver.findElement(By.name("alertbox"));
		File s = E1.getScreenshotAs(OutputType.FILE);         // outputType is a class
		File d = new File("D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\ScreenShot1/sct5.png");
		FileUtils.copyFile(s, d);
		
		
		
		
		
		
		
	}

}
