package Assignment;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import connenction.Driverconnection;

public class login {
	String username;
	String password;
	
	public  login(String username,String password) {
	this.username=username;
	this.password=password;
	}
	static WebDriver driver=null;
	@BeforeTest
	public void OpenBrowser() {
		String url="https://www.instagram.com/";
		driver=Driverconnection.getDriver(url);
	}
	
	@Test
	public void loginTest() {
		WebElement user=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		user.click();
		user.sendKeys(username);
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
	    pass.click();
		pass.sendKeys(password);
	}
	@Parameters
	public static List<Object[]>data(){
	Object [][]obj =new Object[4][2];
	
	obj[0][0]="tushar_D";
	obj[0][1]="Tushar@123";
	
	obj[1][0]="tushar";
	obj[1][1]="Tushar";
	
	obj[2][0]="tushar_E";
	obj[2][1]="Tushar@123";
	
	obj[3][0]="tushar_D";
	obj[3][1]="Tushar@12";
	
	return Arrays.asList(obj);

}
}