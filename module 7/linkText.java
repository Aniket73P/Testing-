package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;

public class linkText {
	public static void main(String[] args) throws InterruptedException {
		String url="https://www.facebook.com/";
		WebDriver driver=Driverconnection.getDriver(url);
		Thread.sleep(2000);	
		
		
		WebElement c=driver.findElement(By.linkText("Create a Page"));
		c.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		Thread.sleep(2000);
		WebElement c1=driver.findElement(By.linkText("Create ad"));
		c1.click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		WebElement c2=driver.findElement(By.linkText("Careers"));
		c2.click();
		driver.navigate().back();
		Thread.sleep(10000);
		
		Thread.sleep(2000);
		WebElement c3=driver.findElement(By.linkText("Developers"));
		c3.click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		driver.quit();
	}
	
}
