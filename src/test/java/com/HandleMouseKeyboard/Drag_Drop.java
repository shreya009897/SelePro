package com.HandleMouseKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		// driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		// driver.get("https://www.ebay.in/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
// Q. How to Drag and Drop ?
//		WebElement s = driver.findElement(By.id("box6"));
//  	WebElement d =  driver.findElement(By.id("box106"));
//		Actions act = new Actions(driver);
//		act.dragAndDrop(s, d).perform();
	
// Q. Move to element
//		 WebElement e1 = driver.findElement(By.linkText("Shipping"));
//	     Actions act = new Actions(driver);
//	     act.moveToElement(e1).perform();

// Q. Enter text and press enter
//	     driver.findElement(By.id("APjFqb")).sendKeys("hello");
//	     Actions act = new Actions(driver);
//	     act.sendKeys(Keys.ENTER).perform();
	     
// Q. select text before pressing enter
	     driver.findElement(By.id("APjFqb")).sendKeys("hello");
	     Actions act = new Actions(driver);
	     act.keyDown(Keys.CONTROL);
	     act.sendKeys("A");
	     act.keyUp(Keys.CONTROL);
	     act.sendKeys(Keys.ENTER).perform();
	}

}
