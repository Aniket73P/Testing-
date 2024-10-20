 package my_selenium_p;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;

public class swaglabs_demo {

	
public static void main(String[] args) throws InterruptedException {
	String url="https://www.saucedemo.com/v1/index.html";
	WebDriver driver=Driverconnection.getDriver(url);
	
WebElement uname=driver.findElement(By.tagName("input"));
uname.sendKeys("standard_user");


WebElement pass=driver.findElement(By.id("password"));
pass.sendKeys("secret_sauce");

driver.findElement(By.className("btn_action")).click();
 
driver.findElement(By.linkText("Sauce Labs Backpack")).click();
Thread.sleep(2000);

driver.findElement(By.className("inventory_details_back_button")).click();


driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
Thread.sleep(2000);


driver.findElement(By.className("inventory_details_desc_container")).click();


driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
Thread.sleep(2000);

driver.findElement(By.className("inventory_details_desc_container")).click();


driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
Thread.sleep(2000);


driver.findElement(By.className("inventory_details_back_button")).click();


driver.findElement(By.linkText("Sauce Labs Onesie")).click();
Thread.sleep(2000);

driver.findElement(By.className("inventory_details_desc_container")).click();


driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)")).click();
Thread.sleep(2000);

driver.findElement(By.className("inventory_details_back_button")).click();

//driver.findElement(By.className("btn_secondary")).click();

driver.findElement(By.linkText("ADD TO CART")).click();

driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg")).click();


driver.findElement(By.linkText("CHECKOUT")).click();

driver.findElement(By.id("first-name")).sendKeys("aniket");
driver.findElement(By.id("last-name")).sendKeys("patil");
driver.findElement(By.id("postal-code")).sendKeys("111222");

driver.findElement(By.className("btn_primary cart_button")).click();

driver.findElement(By.linkText("FINISH")).click();



Thread.sleep(3000);
 
driver.quit();


}
	
	
	
}
