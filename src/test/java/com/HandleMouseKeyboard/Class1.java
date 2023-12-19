package com.HandleMouseKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* How to perform Mouse and Keyboard Operation
		 -> With the help of "Action Class" 
		 -> Action class required the browser web driver reference
		 -> Action class inside The "Org.Openqa.Selenium.Inertaction Package "
		       class Action {
		       
		     #  public Action doubleClick()}
		     
		     act.contextClick(E1) => Build()* method in the Actions class is used to creat a chain of actions or operations you want to perform.
		     perform() method in the Action class is used to execute the chain of actions operation you want to perform. */

	
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
// Q. How to perform Right click		
//		WebElement e1 = driver.findElement(By.id("rightClickBtn"));
//		
//		act.contextClick(e1).perform();
		
// Q. How to perform Double click ?
		WebElement e1 = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(e1).perform();
		act.doubleClick(e1).build().perform();
	}
}
