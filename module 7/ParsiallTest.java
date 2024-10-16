package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;

public class ParsiallTest {
	public static void main(String[] args) {
		String url="https://www.facebook.com/";
		WebDriver driver=Driverconnection.getDriver(url);
		
	List<WebElement>links= driver.findElements(By.partialLinkText("Meta"));
	for(WebElement e:links) {
		System.out.println(e.getText());	
	}
	System.out.println("    ");
	
	List<WebElement>CR= driver.findElements(By.partialLinkText("Create"));
	for(WebElement e:CR) {
		System.out.println(e.getText());	
	}
		
	}
}
