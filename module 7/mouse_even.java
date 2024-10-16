package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connenction.Driverconnection;

public class mouse_even {
	public static void main(String[] args) throws InterruptedException {
		String url="https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver=Driverconnection.getDriver(url);
		Thread.sleep(2000);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement fight=driver.findElement(By.linkText("Flights"));
		WebElement hotel=driver.findElement(By.linkText("Hotels"));
		WebElement car =driver.findElement(By.linkText("Car Rentals"));
		WebElement crusis=driver.findElement(By.linkText("Cruises"));
		WebElement Desti=driver.findElement(By.linkText("Destinations"));
		WebElement vac=driver.findElement(By.linkText("Vacations"));
		
		Actions action=new Actions(driver);
		action.moveToElement(home).perform();		Thread.sleep(2000);

		
		action.moveToElement(fight).perform();		Thread.sleep(2000);

		action.moveToElement(hotel).perform();		Thread.sleep(2000);

		action.moveToElement(car).perform();		Thread.sleep(2000);

		action.moveToElement(crusis).perform();		Thread.sleep(2000);

		action.moveToElement(crusis).perform();		Thread.sleep(2000);

		action.moveToElement(Desti).perform();		Thread.sleep(2000);

		action.moveToElement(vac).perform();		Thread.sleep(2000);

	}
}
