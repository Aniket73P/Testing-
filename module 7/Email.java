package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import connenction.Driverconnection;

public class Email {
	public static void main(String[] args) throws InterruptedException {
		String url="https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail&ddm=0&dsh=S-1707677271:1721729777107759&ec=GAlAFw&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en-GB&service=mail&TL=ALoj5Aq5ZCTreGzX3weMkelwTfDrbwi0o_o-EOo6lxL8l4hBJ9ZJcjmtrlMhSWJ6";
		WebDriver driver=Driverconnection.getDriver(url);
		
		WebElement btn=driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
	btn.click();
		
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("aniket");
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("patil");
		WebElement btn1=driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
		btn1.click();
		
		
		Thread.sleep(5000);
		
		WebElement day=driver.findElement(By.id("day"));
		day.sendKeys("1");
		
		WebElement months=driver.findElement(By.id("month"));
		Select month=new Select(months);
		month.selectByValue("2");
		
		WebElement year=driver.findElement(By.id("year"));
		year.sendKeys("2004");
		
		
		WebElement gender=driver.findElement(By.id("gender"));
		gender.click();
		Select genders =new Select(gender);
		genders.selectByVisibleText("Male");
//		System.out.println(gender);
//		gender.get(1).click();
		
		WebElement btn2=driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
		btn2.click();
		
			Thread.sleep(5000);

//			WebElement user=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div/div[1]/div/div[1]/div/div[1]/input"));
//			user.sendKeys("aniketpatil85");
//		
//		WebElement Rbtn=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[1]/div/span/div[1]/div/div[1]/div"));
//		Thread.sleep(2000);

		WebElement btn3=driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
		btn3.click();
	
}
}
