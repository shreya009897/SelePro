package Module1;

import java.awt.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CountHyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	driver.get("https:www.calculator.net/");
		driver.manage().window().maximize();
	
//Q. How to count Hyperlink?
		
	  //  List<WebElement>l1 = driver.findElements(By.tagName("a"));   
	//	System.out.println(l1.size());
		
//Q. How to display hyperlink name in text form  ?
		// for( WebElement l2:l1) {
		// System.out.println(l2.getText());
		//}
		 
		

	}

}
