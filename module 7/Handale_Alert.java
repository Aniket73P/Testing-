package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;

public class Handale_Alert {
	public static void main(String[] args) {
		String url="https://demo.guru99.com/test/delete_customer.php";
		WebDriver driver=Driverconnection.getDriver(url);
		
		WebElement Alert=driver.findElement(By.name("cusid"));
		Alert.sendKeys("85467512");
		WebElement btn=driver.findElement(By.name("submit"));
		btn.click();
		Alert
		alert=   driver.switchTo().alert();
		alert.accept();
		
		
	}



}
