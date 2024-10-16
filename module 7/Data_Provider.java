package Assignment;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import connenction.Driverconnection;

public class Data_Provider {
	static WebDriver driver=null;
	@BeforeClass
	public static void Open() {
			driver=Driverconnection.getDriver("https://www.instagram.com/");
			
	}
	
	@Parameters ("dp")
	@Test(DataProvider = "dp")
	public void test(String username,String password) throws InterruptedException {
		WebElement user=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		user.clear();
		user.sendKeys(username);
		user.clear();

		WebElement pass=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		pass.clear();
		pass.sendKeys(password);
		pass.clear();

	}
	@DataProvider(name="dp")
	public static Object[][]data() throws InterruptedException{
		Object [][]obj=new Object[4][2];
		
		obj[0][0]="aniket_5";
		obj[0][1]="ANIKET@123";
		
		Thread.sleep(3000);

		obj[1][0]="AJAY_5";
		obj[1][1]="ajay@123";
		
		Thread.sleep(3000);

		obj[2][0]="aniket_40";
		obj[2][1]="aniket@123";

		Thread.sleep(3000);

		obj[3][0]="aniket_22";
		obj[3][1]="aniket@";
		
		return obj;
	
}
