package Basic.Junit_01;

import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import connection.Driverconnection;

public class LoginTest {

	
		

	    @Before
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");  // Replace with your ChromeDriver path
	        Driver = new ChromeDriver();
	    }

	    @Test
	    public void testInstagramLoginPage() {
	        
	        driver.get("https://www.instagram.com/accounts/login/");
	        
	        
	        WebElement username = driver.findElement(By.name("username"));
	        username.sendKeys("aniketpatil");

	       
	        WebElement password = driver.findElement(By.name("password"));
	        password.sendKeys("aniket@123");

	        
	        WebElement loginButton = driver.findElement(By.id("submit"));
	        loginButton.click();

	    }

	    @After
	    public void tearDown() {
	        Driver.quit();  // Close the browser
	    }
	
}
