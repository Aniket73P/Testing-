package Basic.Junit_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {
	
	WebDriver driver;

	public void openBrowser(String browserType) {
	    if (browserType.equals("Chrome")) {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	    }
	    
	}

	public void navigateTo(String url) {
	    driver.get(url);
	}

	public void click(String locatorType, String locatorValue) {
	    if (locatorType.equals("id")) {
	        driver.findElement(By.id(locatorValue)).click();
	    } else if (locatorType.equals("name")) {
	        driver.findElement(By.name(locatorValue)).click();
	    }
	    
	}

	public void enterText(String locatorType, String locatorValue, String data) {
	    if (locatorType.equals("id")) {
	        driver.findElement(By.id(locatorValue)).sendKeys(data);
	    } else if (locatorType.equals("name")) {
	        driver.findElement(By.name(locatorValue)).sendKeys(data);
	    }
	    
	}

	public void closeBrowser() {
	    if (driver != null) {
	        driver.quit();
	    }
	}

}
