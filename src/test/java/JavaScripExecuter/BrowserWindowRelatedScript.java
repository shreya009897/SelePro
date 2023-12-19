package JavaScripExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserWindowRelatedScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		// driver.get("https://www.calculator.net/");
		// driver.get("https://practicetestautomation.com/practice-test-login");
		 driver.manage().window().maximize();
		 
		//Window.scrollTo(x-pixel,y-pixel) = x-> horizontal(means left to right scroll)move
		//and y-> verticle move(top to down scroll) agar y ki value negative dale to down se up jayga
						
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;			
		 js.executeScript("window.location='https://practicetestautomation.com/practice-test-login/'");
		 
		 js.executeScript("document.getElementById('username').value='student';");
		 js.executeScript("document.getElementById('password').value='Password123';");
		 WebElement e1 = driver.findElement(By.id("submit"));
		 js.executeScript("arguments[0].click();",e1);
		 
		 WebElement e2 = driver.findElement(By.linkText("Log out"));
		 js.executeScript("arguments[0].style.border = '3px solid red';",e2);
		 
		 // To scroll down the webpage by the visibility of the element
		 WebElement e3 = driver.findElement(By.linkText("Age Calculator"));
		 js.executeScript("arguments[0].scrollTntoView();",e3);
		 
		 // scrollBy
//		 js.executeScript("window.scrollBy(0,250)");
//		 // UP to Down
//		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		 Thread.sleep(2000);
//		 // Down to Up
//		 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		 
//		 // Scroll To
//		 js.executeScript("window.scrollTo(0,250)");
//		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		 Thread.sleep(2000);
//		 js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
//		 
//		 // Zoom in
//		 js.executeScript("document.body.style.zoom='150%'");
//		 
//		 // width and Height of the available window page
//		 String Height = js.executeScript("return window.innerHeight;").toString();
//		 System.out.println(Height);
//	     String Width = js.executeScript("return window.innerWidth;").toString();
//	     System.out.println(Width);
	     
	     // Alert generate
		 // js.executeScript("alert('hello selenium');");
		 
		 // 
	     
	
	
	}

}
