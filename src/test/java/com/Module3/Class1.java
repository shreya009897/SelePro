package com.Module3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// WebDriverManager.firefoxdriver().setup();
		
		// WebDriverManager
		// WebDriverManager is Abstrat class , it calls their method like Firfoxdriver(), and then call setup() method and it integrate browser Firefoxdriver.exe
		
		// SeleniumManager
		// It replace WebDriverManger , 
		// javascriptExecutor    , it is a interface and its parent Interface is SearchContext Interface
		// if sometimes, if any action not performed by  java code so, then we use JavaScripExecutor

		
		 WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.google.com/");
		// System.out.println(driver.getTitle());
		
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
