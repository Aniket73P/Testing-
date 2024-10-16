package Assignment;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;

public class Performlogin {
	static WebDriver driver = null;	
	@BeforeClass
	public static void login() {
		String url="https://www.facebook.com/";	
		 driver=Driverconnection.getDriver(url);
	}
	@Test
	public void test1() {
		
	WebElement t1=driver.findElement(By.name("email"));
	t1.sendKeys("tushar@gmail.com");
	WebElement t2=driver.findElement(By.name("pass"));
	t2.sendKeys("tushar@123");
		
	}
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
}
