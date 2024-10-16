package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connenction.Driverconnection;

public class keyboard_even {
	public static void main(String[] args) throws InterruptedException {
		String url="https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver=Driverconnection.getDriver(url);
		
		WebElement fname=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	
		Actions action=new Actions(driver);
			action.click(fname)			
			.keyDown(Keys.SHIFT)
					.sendKeys("aniket")
					.keyUp(Keys.SHIFT)
					.build()
					.perform();
			
//			Thread.sleep(2000); 	
			WebElement lname=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
		
//			Actions action1=new Actions(driver);
				action.click(lname)
				.keyDown(Keys.SHIFT)
						.sendKeys("patil")
						.keyUp(Keys.SHIFT)
						.build()
						.perform();
				
		
		WebElement  phone=driver.findElement(By.name("phone"));		
				phone	.sendKeys("8849421545");
				
				
		WebElement  email=driver.findElement(By.id("userName"));
		action.click(email)
			.keyDown(Keys.SHIFT)
			.sendKeys("tushardharaiya@gmail")
			.keyUp(Keys.SHIFT)
			.sendKeys(".")
			.keyDown(Keys.SHIFT)
			.sendKeys("com")
			.keyUp(Keys.SHIFT)
			.build()
			.perform();
		
		WebElement add=driver.findElement(By.name("address1"));
		action.click(add)
		.keyDown(Keys.SHIFT)
		.sendKeys("Amraiwadi")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		WebElement city=driver.findElement(By.name("city"));
		action.click(city)
		.keyDown(Keys.SHIFT)
		.sendKeys("ahmedabad")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		WebElement state=driver.findElement(By.name("state"));
		action.click(state)
		.keyDown(Keys.SHIFT)
		.sendKeys("gujarat")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		WebElement pin=driver.findElement(By.name("postalCode"));
		pin.click();
		pin	.sendKeys("380026");
		
		WebElement country=driver.findElement(By.name("country"));
		country.click();
		country.sendKeys("india");	
		country.click();
		
		
		WebElement user=driver.findElement(By.id("email"));
		
		action.click(user)
			.keyDown(Keys.SHIFT)
			.sendKeys("aniket")
			.keyUp(Keys.SHIFT)
			.sendKeys("123")
			.keyUp(Keys.SHIFT)
			.build()
			.perform();
		
		WebElement 	pass=driver.findElement(By.name("password"));
		pass.sendKeys("aniket@123");
		
		WebElement compass=driver.findElement(By.name("confirmPassword"));
		compass.sendKeys("aniket@123");
		
		
		
	}
}
