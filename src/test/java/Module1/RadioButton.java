package Module1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
//QQQ. How to select Radio button
		 driver.get("http://test.rubywatir.com/radios.php");
		// driver.findElement(By.className("radioclass")).click();
		// driver.findElement(By.xpath("//input[@type= 'radio'][4]")).click();

//. How to check radio button selected or not?
		// WebElement e1=driver.findElement(By.className("radioclass"));
		 WebElement e1=driver.findElement(By.xpath("//input[@value='Radio1']"));

		if(e1.isSelected())
		{
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}

		// driver.findElement(By.xpath("//input[@type='radio'][4]")).click();

// Q. How to count radio button?
//		 List<WebElement> l1= driver.findElements(By.xpath("//input[@type='radio']"));
//		 System.out.println(l1.size());
//				
			
	}

}
