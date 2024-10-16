package Assignment;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import connenction.Driverconnection;

public class Tops_multipal_perameters {
	static WebDriver driver=null;
	
	@BeforeClass
	public static void test() {
		String url="https://www.instagram.com/";
		driver=Driverconnection.getDriver(url);
	}
@Test
public void test(String email,String password) {
//WebElement emailEle=
}
}
