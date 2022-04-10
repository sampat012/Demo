import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Shree Swami Samarth");
		
		/* System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\newframework\\New_Framework\\Driver\\chromedriver.exe" );
		driver=new ChromeDriver();// open a browser upcasting concept
		
		//driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// Use the timeout when navigating to a webpage
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");// open a specific url
		Thread.sleep(4000);
		driver.navigate().to("https://www.flipkart.com/");
		//Thread.sleep(4000);
		driver.manage().deleteAllCookies();
		System.out.println("Jai Jai Shree Swami Samarth");
		//driver.quit(); */
		

	} 

}
