package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;

public class hiperlink {
	public static void main(String[] args) {
		String url="https://demo.guru99.com/test/web-table-element.php";
		WebDriver driver=Driverconnection.getDriver(url);
		
			List<WebElement>rows =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
			for (WebElement r:rows) {
				System.out.println(r.getText());
//			for(int i=1;i<=rows.size();i++) {
//				List<WebElement>columns=driver.findElements(By.xpath("//tbody/tr/td"));
//			for(WebElement c:columns) {
//				System.out.println(c.getText());
			}
						
		}
		
	
}
