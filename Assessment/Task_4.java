package Assessment;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import connenction.Driverconnection;

import org.openqa.selenium.TakesScreenshot;

public class Task_4 {

	public static void main(String[] args) {
		String url = "https://demoqa.com/webtables";
		WebDriver driver = Driverconnection.getDriver(url);
		
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("aniket");
		driver.findElement(By.id("lastName")).sendKeys("patil");
		driver.findElement(By.id("userEmail")).sendKeys("aniketpatil7733@gmail.com");
		driver.findElement(By.id("age")).sendKeys("19");
		driver.findElement(By.id("salary")).sendKeys("20000");
		driver.findElement(By.id("department")).sendKeys("null");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//*[@id=\"delete-record-1\"]")).click();

		
		
	}
	
	
	
}
