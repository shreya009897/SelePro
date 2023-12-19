package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://saucedemo.com/");
		driver.manage().window().maximize();


		// Basic Locators
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		 driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		// driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		// driver.findElement(By.partialLinkText("Sauce Labs Back")).click();
	}

}
