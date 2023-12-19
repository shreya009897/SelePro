package com.Module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTabandWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
/* newWindow is method of Targetlocator interface and 
 * TargetLocator is child interface of Webdriver interface, SwitchTo is the method of webdriver interface*/		

// How to open a new tab 
//		driver.get("https://www.rediff.com");
//		driver.switchTo().newWindow(WindowType.TAB);       
		//windowtype is a ENUM class which perform window tab operation
		
//		driver.get("https://www.google.com/");
		
		
// How to open a new window
		driver.get("https://www.rediff.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.fb.com/");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
