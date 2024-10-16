package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;

public class logo {
	public static void main(String[] args) {
		String url="https://www.facebook.com/";
		WebDriver driver=Driverconnection.getDriver(url);
		
	WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
				System.out.println(logo.getText());
				
				driver.switchTo().hashCode();
		}
}
