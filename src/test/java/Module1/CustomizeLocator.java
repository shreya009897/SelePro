package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://saucedemo.com/");
		
		// manage is the method of  under webdriver interface and return type of manage is options =>
		// window is the method of under option interface and return type of window is window and options is the child interface of webdriver =>
		// and maximize is the method of  under window interface and its return type is void and window is child interface of
		driver.manage().window().maximize();
		
		//Customize locator  Relative x-path
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// Multiple Attributes
		 driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
		 // driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		 driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpa' or @name='add-to-cart-sauce-labs-backpack']")).click();

		
	}

}
