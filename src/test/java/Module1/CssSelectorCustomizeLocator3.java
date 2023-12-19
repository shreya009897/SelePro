package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorCustomizeLocator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		// Tag and id
		 driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		// Tag and Attribute
		 driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");
		// Tag and class
		 driver.findElement(By.cssSelector("input.submit-button")).click();
		// Tag class attributes
		driver.findElement(By.cssSelector("button.btn[id=add-to-cart-sauce-labs-backpack]")).click();

	}

}
