package Assignment;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import connenction.Driverconnection;

public class facebook_login {
	static WebDriver driver;
	@BeforeTest  
	public  void  openBrowser() {
		String url="https://www.facebook.com/";
	 driver=Driverconnection.getDriver(url);
	}
		
	@Test
		public  void logintest() {
		WebElement emailEle=driver.findElement(By.name("email"));
		emailEle.sendKeys("tushar@gmail.com");
		
		WebElement passEle=driver.findElement(By.name("pass"));
		passEle.sendKeys("tushar@123");
		
		driver.findElement(By.name("login")).click();
	}
		@AfterTest
		public  void closeBrowser() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		}
	
	
}
