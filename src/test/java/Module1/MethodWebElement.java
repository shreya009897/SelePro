package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement e1 = driver.findElement(By.id("username"));
		// e1 ka returntype webelement hai
		
		 e1.sendKeys("student");
		// sendkeys webelement interface ka method hai or iska returntype void

		
		// to display the website , isDisplayed is the method of webElement interface , its return type is boolean
		System.out.println(e1.isDisplayed());  

		// to find Attributes          getAttributes ka returntype string
		String s1 = e1.getAttribute("type");
		System.out.println(s1);

		String s2 = e1.getAttribute("id");
		System.out.println(s2);

		String s3 = e1.getAttribute("name");
		System.out.println(s3);

		// tagName
		 String s4 = e1.getTagName();
System.out.println(s4);
	}

}
