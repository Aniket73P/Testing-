package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;

public class Radios {
	public static void main(String[] args) throws InterruptedException
	{
		String url = "http://demo.guru99.com/test/radio.html" ;
		WebDriver driver = Driverconnection.getDriver(url);
		
		WebElement Radio1 = driver.findElement(By.id("vfb-7-1"));
		Radio1.click();
		Thread.sleep(2000);
		
		WebElement Radio2 = driver.findElement(By.id("vfb-7-2"));
		Radio2.click();
		Thread.sleep(2000);
		
		WebElement Radio3 = driver.findElement(By.id("vfb-7-3"));
		Radio3.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
