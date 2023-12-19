package Module1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
// Q. How to handle drop-down list?
		 WebElement E1 = driver.findElement(By.tagName("Select"));
		 Select s1 = new Select(E1);
		// s1.selectByVisibleText("Tunisia");
		// s1.selectByValue("TUN");
		// s1.selectByIndex(6);

// Q. Ho to get all values of dropdown in Selenium ?		
//	  	List<WebElement>l1=s1.getOptions();
//	  	for(WebElement l2:l1) {
//	  		System.out.println(l2.getText());
//	  		}
		
//isMultiple
		 if(s1.isMultiple())
		 {
			System.out.println("yes");
		 }
		 else {
			System.out.println("No");
		 }
// Q. How to check how many dropdown list on the webpage ?
//        	List<WebElement> l1 = driver.findElements(By.tagName("select"));
//        	 System.out.println(l1.size());
        	
	}

}
