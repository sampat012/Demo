package com.BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
public static WebDriver driver;
	
	public static void initialisation () {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-cucumber\\framework\\Driver\\chromedriver.exe");
	 
	 driver=new ChromeDriver();
	 
	 driver.get("https://www.demoblaze.com/");
	 
 }
}

