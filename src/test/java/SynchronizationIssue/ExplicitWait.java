package SynchronizationIssue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement e1 = wait.until(ExpectednConditions.visibilityOfElementLocated(By.id("username")));
//		e1.sendKeys("sttudent");
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		StopWatch watch = null;
		try {
			watch = StopWatch.createStarted();
			driver.findElement(By.name("alertbox")).click();
		watch.until(ExceptedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		}
		
		catch(Exception e) {
		watch.stop();
		System.out.println(e);
		System.out.println(watch.elapsed(TimeUnit.SECONDS));
	}
	}

}
