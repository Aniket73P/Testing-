package Assignment;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connenction.Driverconnection;

public class facbook {
	String email;
	String password;
	public  facbook(String email,String password) {
		this.email=email;
		this.password=password;
		
	}
	static WebDriver driver=null;

	
	
	@Before
	public void OpenBrowser() {
	String url="https://www.facebook.com/";
	 driver=Driverconnection.getDriver(url);
	}
	
	@Test
	public void logintest() {
		WebElement emailEle=driver.findElement(By.name("email"));
		emailEle.sendKeys(email);
		WebElement passEle=driver.findElement(By.name("pass"));
		passEle.sendKeys(password);
	}
	
	@Parameters
	public static List<Object[]>data(){
		Object [][]obj=new Object[4][2];
		
		obj[0][0]="correct@gmail.com";
		obj[0][1]="correct@123";
		
		obj[1][0]="incorrect@gmail.com";	
		obj[1][1]="correct@123";
		
		obj[2][0]="correct@gmail.com";
		obj[2][1]="incorrect@123";
		
		obj[3][0]="incorrect@gmail.com";
		obj[3][1]="incorrect@123";
		
		return Arrays.asList(obj);
	}
}
