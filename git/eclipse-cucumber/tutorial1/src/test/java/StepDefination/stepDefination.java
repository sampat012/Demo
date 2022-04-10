package StepDefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.BaseLayer.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination extends BaseClass  {
	
	@Given("login onto OrangeHRM")
	public void login_onto_orange_hrm() {
	    BaseClass.initialisation();
	}

	@When("user insert correct Username and Password")
	public void user_insert_correct_username_and_password() throws InterruptedException 
	{
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign-username")).sendKeys("ABCDEF");
		driver.findElement(By.id("sign-password")).sendKeys("sam1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Alert alt=driver.switchTo().alert();
		String str=alt.getText();
		System.out.println(str);
		alt.accept();
	}

	@Then("user on Login Page")
	public void user_on_login_page() {
		//driver.close();
	   
	}

}
