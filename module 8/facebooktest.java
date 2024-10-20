package Basic.TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();       
        driver.manage().window().maximize();
    }

    @Test
    public void verifyFacebookTitle() {
        // Navigate to Facebook
        driver.get("https://www.facebook.com");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertTrue(title.contains("Facebook"), "Title does not contain Facebook");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}


