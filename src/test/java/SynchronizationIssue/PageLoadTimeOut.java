package SynchronizationIssue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(4,TimeUnit.SECONDS);
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

}
