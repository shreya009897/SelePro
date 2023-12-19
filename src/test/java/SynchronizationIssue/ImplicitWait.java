package SynchronizationIssue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch watch = null;
		
		try {
			watch=Stopwatch.createStarted();
			driver.findElement(By.id("usernam")).sendKeys("student");	
		}
		catch(Exception e) {
			
		
		watch.stop();
		System.out.println(e);
		System.out.println(watch.elapsed(TimeUnit.SECONDS));
		// driver.findElement(By.id("password")).sendKeys("Password123");
		// driver.findElement(By.id("submit")).click();
		}
		}

}
