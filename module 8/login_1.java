package Assignment.Junit_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;


public class login_1 {

	public static void main(String[] args) throws InterruptedException {
		String url="https://www.saucedemo.com/v1/index.html";
		WebDriver driver=Driverconnection.getDriver(url);
		
	WebElement uname=driver.findElement(By.tagName("input"));
	uname.sendKeys("standard_user");


	WebElement pass=driver.findElement(By.id("password"));
	pass.sendKeys("secret_sauce");

	driver.findElement(By.className("btn_action")).click();
	 
	driver.findElement(By.linkText("Sauce Labs Backpack")).click();

	
	Thread.sleep(3000);

	driver.quit();
	
	
	
	
	
	
	}
	
	
	
}
