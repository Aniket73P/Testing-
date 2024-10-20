package Assessment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;


public class Task_3 {

	
	public static void main(String[] args) {	
	       String url ="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
	      
	       WebDriver driver = Driverconnection.getDriver(url);
	       List<WebElement> structure = driver.findElements(By.xpath("//div[@class='separator']/div[1]/div[5]/table/tbody/tr/th/span"));
         for(int col=1; col<=structure.size();col++) {
	       WebElement struct = driver.findElement(By.xpath("//div[@class='separator']/div[1]/div[5]/table/tbody/tr["+col+"]/th[1]/span"));    
	       System.out.println(struct.getText());

        }
		
	   WebElement lastrow1 = driver.findElement(By.xpath("//div[@class='separator']/div[1]/div[5]/table/tfoot/tr/th"));
	   lastrow1.getText();
	   WebElement lasrow2 = driver.findElement(By.xpath("//div[@class='separator']/div[1]/div[5]/table/tfoot/tr/td"));
	   lasrow2.getText();
		
		}
	
	
}
