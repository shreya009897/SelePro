package com.Module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
// How to display element from frames on webpage
//		driver.get("https://www.rediff.com/");
//		driver.switchTo().frame("moneyiframe");
//		WebElement E1 = driver.findElement(By.id("nseindex"));
//		System.out.println(E1.getText());
		
		
// How to switch frame1 to frame2 from main page
//	     driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
//		 driver.switchTo().frame("frame1");
//		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		
// switch to mmain page before switching frame2 
//		 driver.switchTo().defaultContent();      // default content is the method of target locator interface
//		 driver.switchTo().frame("frame2");
//		 WebElement e4 = driver.findElement(By.id("animals"));
//		 Select sc = new Select(e4);
//		 sc.selectByVisibleText("Baby Cat");
		
// switch frame1 from frame2 through webelement
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		WebElement e4 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(e4);
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Hello");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement e1 = driver.findElement(By.id("animals"));
		Select sc = new Select(e1);
		sc.selectByVisibleText("Baby Cat");
		
//// How to count frames on webpage
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		List<WebElement>l1 = driver.findElements(By.tagName("iframe"));
		System.out.println(l1.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
