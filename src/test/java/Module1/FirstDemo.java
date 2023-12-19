package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Integrate driver                                       // setproperty is method of system class
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		// launch driver
		WebDriver driver = new FirefoxDriver();
		// Hit url
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String s1 = driver.getTitle();  // it'll return string
		System.out.println(s1);
		String s2 = driver.getCurrentUrl();  // it'll also
		System.out.println(s2);
		
		
		//driver.findElement(By.id("username")).sendKeys("student");	                   // sendkeys is the method of webelement interface, so we can..
		WebElement e1 = driver.findElement(By.id("username"));
		e1.sendKeys("student");
		// id locator is the method of 'By' and also id is a static type where we can call directly through 'By' Class
		// By class have  all locators
		// id ka returntype By hota hai
		
		driver.findElement(By.name("password")).sendKeys("Password123");             
		driver.findElement(By.id("submit")).click();

	}

}
