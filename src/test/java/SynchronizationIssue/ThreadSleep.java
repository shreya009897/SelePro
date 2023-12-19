package SynchronizationIssue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Stopwatch;

public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		Stopwatch watch=null; 
		try {
			watch=Stopwatch.createStarted(); 
		Thread.sleep(3000); 
		driver.findElement(By.id("username")).sendKeys("student"); 
		}
		
		 catch(Exception e)
		{ 
			 watch.stop();
			 System.out.println(e); 
			 System.out.println(watch.elapsed(TimeUnit.SECONDS));
		}
		


	}

}
