package StepDefination;

import org.openqa.selenium.By;

import com.BaseLayer.BaseClass;

import io.cucumber.java.en.Then;

public class adminPage extends BaseClass {
	@Then("click on the admin page")
	public void click_on_the_admin_page() {
	    driver.findElement(By.xpath("//a[@class='firstLevelMenu']")).click();
	}

	@Then("click on the Add Button")
	public void click_on_the_add_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		//driver.findElement(By.name("btnSave")).click();
	    
	}

	@Then("click on UserRole and select admin dropDown,employee name,username,staus,password&confirm password")
	public void click_on_user_role_and_select_admin_drop_down_employee_name_username_staus_password_confirm_password() {
	    //driver.findElement(By.xpath("//input[@class='formInputText inputFormatHint ac_input']")).sendKeys("Ananya Dash");
	    driver.findElement(By.xpath("formInputText")).sendKeys("Rajaram");
	    driver.findElement(By.id("systemUser_password")).sendKeys("12345678");
	    driver.findElement(By.id("driver.findElement(By.id(\"systemUser_password\")).sendKeys(\"12345678\");")).sendKeys("12345678");
	    
	}

	@Then("click on save button")
	public void click_on_save_button() {
		driver.findElement(By.id("btnSave")).click();
	}


}
