package Basic.Junit_01;

import org.junit.BeforeClass;
import org.testng.annotations.DataProvider;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.Driverconnection;

public class Data_Driven {

	WebDriver driver;

	@BeforeClass	
	public void openBrowser() {
		driver = Driverconnection.getDriver("https://www.instagram.com/accounts/login/");
	}

	@Test
	public void loginTest(String username, String password) throws InterruptedException {
		System.out.println(username + " " + password);
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		uname.sendKeys(username);

		WebElement pname = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		pname.sendKeys(password);

		Thread.sleep(2000);
	}

	@DataProvider
	public static Object[][] data() {
		ExcelReader ex = new ExcelReader("C:\\Users\\patil\\OneDrive\\Documents\\test excle.xlsx", "login");
		int row = ex.rowCount();
		System.out.println("row :" + row);
		int col = ex.colCount();
		System.out.println("col :" + col);

		Object obj[][] = new Object[row - 1][col];

		for (int i = 1; i <= row; i++) {
			for (int j = 0; j <= col; j++) {
				String data = ex.getData(i, j);
				System.out.println(data + " : " + i + " :  " + j);
				obj[i - 1][j] = data;

			}
		}
		return obj;
	
	
	
	
}
