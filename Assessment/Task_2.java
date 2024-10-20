package Assessment;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connenction.Driverconnection;

public class Task_2 {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker";
		WebDriver driver = Driverconnection.getDriver(url);
		driver.findElement(By.id("Icon Trigger")).click();
		
		WebElement iFrame= driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[3]/p/iframe"));
		driver.switchTo().frame(iFrame);
		System.out.println("switched to frame");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='Select date']")).click();
	}		
}
