package JavaScripExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserRelatedscript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		 driver.get("https://practicetestautomation.com/practice-test-login");
		
		// Get the title Name
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 String s1 = js.executeScript("return document.title;").toString();
				 System.out.println(s1);
				
				// Get the Domain name
				 String s2 = js.executeScript("return document.domain;").toString();
				 System.out.println(s2);
				
				// Get the URL Nmae
				 String s3 = js.executeScript("return document.URL;").toString();
				 System.out.println(s3);

	}

}
