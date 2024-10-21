package Tops;
import java.security.PublicKey;
import java.time.Duration;
import java.util.Set;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.heapprofiler.model.LastSeenObjectId;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Either;
import org.openqa.selenium.support.ui.Select;

import connenction.Driverconnection;
import net.bytebuddy.description.annotation.AnnotationDescription.Latent;
import util.divercnnect;
public class tops_career_centre {

	String url = "https://careercenter.tops-int.com";
    WebDriver driver = Driverconnection.getDriver(url);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
   public   void  login () {
		
		WebElement username = driver.findElement(By.id("mobile"));
		username.sendKeys("8849421545");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("8849421545");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		login.click();
	 }
   
	public void ani () {
		WebElement DropDown = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
		 Actions action = new Actions(driver);
		    action.click(DropDown)
		          .pause(Duration.ofSeconds(3))
		          .keyDown(Keys.ARROW_DOWN)
		          .keyDown(Keys.ENTER)
		          .build()
		          .perform(); 
	}		    
	public void personal_detail () throws InterruptedException {
		
		//profile image
		//driver.findElement(By.id("profileImage")).sendKeys("C:\\Users\\CONCEPT\\Downloads\\WhatsApp Image.jpeg");
		
		
		
		WebElement salutation = driver.findElement(By.id("select2-salutation-container"));
		Actions action = new Actions(driver);
		action.click(salutation)
		      .keyDown(Keys.ENTER)
		      .build()
		      .perform();
		//firstName
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.clear();
		firstname.sendKeys("aniket");
		         
		//lastName
		WebElement lastname = driver.findElement(By.id("lastName"));
	    lastname.clear();
	    lastname.sendKeys("patil");
	    
		//email
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("aniketpatil7733@gamil.com");

     	//linkedln Id	
		WebElement Linid = driver.findElement(By.id("linkedin_id"));
		Linid.clear();
		Linid.sendKeys("https://www.linkedin.com/in/patil-aniket-03841b2a3?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app");
	    //Instagram Id
		WebElement Instid=driver.findElement(By.id("instagram_id"));
		Instid.clear();
		Instid.sendKeys("https://www.instagram.com/ani.k_one8?igsh=Nnc2b3AzejZkOXdw");
	    
	   
//	    js.executeScript("window.scrollBy(0,250)", "");
	    
	    // gender
	    driver.findElement(By.xpath("//*[@id=\"select2-gender-container\"]/span")).click();
	    WebElement gender = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	    Actions action4 = new Actions(driver);
		action4.click(gender)
		      .sendKeys("male")
		//    .keyDown(Keys.ARROW_DOWN)  {female}
		      .pause(Duration.ofSeconds(2))
		      .keyDown(Keys.ENTER)             
		      .build()
		      .perform();
	   
	    // Material status
		driver.findElement(By.xpath("//*[@id=\"select2-maritalStatus-container\"]/span")).click();
		WebElement material_status = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		Actions action5 = new Actions(driver);
			action5.click(material_status )
			       .sendKeys("unMarried")
			       .pause(Duration.ofSeconds(2))
			       .keyDown(Keys.ARROW_DOWN)
	               .keyDown(Keys.ENTER)
	               .build()
	               .perform();
	    Thread.sleep(3000);	
	    
		driver.findElement(By.id("birthdate")).sendKeys("01/01/2004");	    	
		js.executeScript("window.scrollBy(0,300)", "");
			
	    //fatherName
	    WebElement father_name = driver.findElement(By.id("fatherName"));
		father_name.clear();
		father_name.sendKeys("krishnabhai");
				       
		//gardianName
		WebElement gardian_name = driver.findElement(By.id("guardianName"));
		gardian_name.clear();
		gardian_name.sendKeys("krishnabhai");
				       
		//mother Name
		WebElement mother_name = driver.findElement(By.id("motherName"));
		mother_name.clear();
		mother_name.sendKeys("vijaya k patil ");
					       
		//religion
		driver.findElement(By.xpath("//span[@id='select2-religion-container']/span")).click();
		WebElement religion = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		Actions action9 = new Actions(driver);
	    action9.click(religion )
	            .sendKeys("hindu")
		        .keyDown(Keys.ENTER)
		        .build()
		        .perform();
		 
		 
		//category
	    driver.findElement(By.xpath("//span[@id=\"select2-category-container\"]/span")).click();
	    WebElement category = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		Actions action10 = new Actions(driver);
		action10.click(category )
		        .sendKeys("Ganral")
		        .keyDown(Keys.ENTER)
		        .build()
		        .perform();
    	//disability
		driver.findElement(By.xpath("//span[@id='select2-disability-container']/span")).click();
		WebElement disability = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	    Actions action11 = new Actions(driver);
		    action11.click(disability )
		            .pause(Duration.ofSeconds(2))
		            .sendKeys("no")
			        .keyDown(Keys.ENTER)
			        .build()
			        .perform();
		//ID type 
		 driver.findElement(By.xpath("//span[@id='select2-idType-container']/span")).click();   
		 WebElement ID_type = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		 Actions action12 = new Actions(driver);
		 action12.click(ID_type )
		         .sendKeys("aadhar")
				 .keyDown(Keys.ENTER)
				 .build()
				 .perform();    
		 
		//ID number
		 WebElement ID_number = driver.findElement(By.id("idNo"));
	     ID_number.clear();
		 ID_number.sendKeys("4555500000");
		 
		//Education level
		 WebElement Education = driver.findElement(By.id("select2-educationLevel-container"));
		 Actions action14 = new Actions(driver);
		 action14.click(Education )
				 .keyDown(Keys.ENTER)
				 .build()
				 .perform();    
		
		js.executeScript("window.scrollBy(300,500)", ""); 
		 
		//address
		WebElement address = driver.findElement(By.id("address"));
		address.clear();
		address.sendKeys("amraiwadi ahmedabad");
					       
		//Pincode
		WebElement pincode = driver.findElement(By.id("pincode"));
		pincode.clear();
	    pincode.sendKeys("380026");
					        
		//country 
		WebElement country = driver.findElement(By.id("select2-country-container"));
		Actions action17 = new Actions(driver);
		action17.click(country) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
		  
		//state 
		WebElement state = driver.findElement(By.id("select2-state-container"));
		Actions action18 = new Actions(driver);
		action18.click(state) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
		   
		//district
		WebElement district = driver.findElement(By.id("select2-district-container"));
		Actions action19 = new Actions(driver);
		action19.click(district) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
		    
		//city 
		WebElement city = driver.findElement(By.id("select2-city-container"));
		Actions action20 = new Actions(driver);
		action20.click(city) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
		//training
		WebElement training = driver.findElement(By.id("select2-trainingStatus-container"));
		Actions action21 = new Actions(driver);
		action21.click(training) 
		         .keyDown(Keys.ENTER)
				 .build()
				 .perform() ; 
	    // Aaddhar card
		driver.findElement(By.id("aadharFront")).sendKeys("C:\\Users\\CONCEPT\\Downloads\\WhatsApp Image.jpeg");
		driver.findElement(By.id("aadharBack")).sendKeys("C:\\Users\\CONCEPT\\Downloads\\WhatsApp Image.jpeg");
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
      
	}
	
	public void Education_detail () throws InterruptedException {
		WebElement DropDown = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
		Actions action = new Actions(driver);
		action.click(DropDown)
		      .pause(Duration.ofSeconds(3))
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ENTER)
		      .build()
		      .perform(); 
		
	    //add education details	
	    driver.findElement(By.linkText("+ Add Education Details")).click();
	   
	    driver.findElement(By.id("degree")).sendKeys("10thpass");
	    driver.findElement(By.id("collegeName")).sendKeys("LJ poly");
	    driver.findElement(By.id("passingYear")).sendKeys("2024");
	    driver.findElement(By.id("result")).sendKeys("70");
	    driver.findElement(By.id("eduResultUnit")).click();
	    driver.findElement(By.xpath("//div[@id='mobileAddBtnSection-courseEdu']/div/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[4]/div[2]/div/a[2]")).click();
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
	
	
	
	}
	    // change_password	
	public void change_password  () {
		WebElement DropDown = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
		Actions action = new Actions(driver);
		action.click(DropDown)
		      .pause(Duration.ofSeconds(3))
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ARROW_DOWN)
		      .keyDown(Keys.ENTER)
		      .build()
		      .perform(); 
		
		driver.findElement(By.id("current_password")).sendKeys("8849421545");
		driver.findElement(By.id("new_password")).sendKeys("123456");
        driver.findElement(By.id("confirm_password")).sendKeys("123456");
	    WebElement confirm =  driver.findElement(By.id("changePasswordSubmit"));
	    confirm.click();
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}
	    //logout
	  public void log_out  () {
	    WebElement DropDown = driver.findElement(By.xpath("//body/div[@id='main-header']/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]/i[1]"));
	 		Actions action = new Actions(driver);
	 		action.click(DropDown)
	 		      .pause(Duration.ofSeconds(3))
	 		      .keyDown(Keys.ARROW_DOWN)
	 		      .keyDown(Keys.ARROW_DOWN)
	 		      .keyDown(Keys.ARROW_DOWN)
	 		      .keyDown(Keys.ARROW_DOWN)
	 		      .keyDown(Keys.ENTER)
	 		      .build()
	 		      .perform(); 
	 		
	  }
	//notification
	public void notification() {
		driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/a[1]")).click();
		
		WebElement filter = driver.findElement(By.id("notificationFilter"));
		Actions action23 = new Actions(driver);
		action23.click(filter)
		        .keyDown(Keys.ARROW_DOWN)
		        .keyDown(Keys.ARROW_DOWN)
		        .keyDown(Keys.ENTER)
                .build()
                .perform();
	
	   WebElement view_account = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/label[1]"));	
	   view_account.click();
	   driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}	
	
	//my course	
	public void My_Course() throws InterruptedException  {
		//courses details
		 driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div")).click();
		 Thread.sleep(2000);
	     driver.findElement(By.linkText("Course Details")).click();	
	     Thread.sleep(2000);
	     driver.findElement(By.id("course-course-tab")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("course-attendance-tab")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("course-accounts-tab")).click();
    	 driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	     
	     //project
	     WebElement project =  driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div"));
	     Actions action =  new Actions(driver);
	     action.click(project)	           
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
               .keyDown(Keys.ENTER)
               .build()
               .perform();
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@id='course-project']/div/div[1]/h4/a")).click();
	     Thread.sleep(3000);
	     
	    //assignment
	     WebElement Assignment  =  driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div"));
	     Actions action1 =  new Actions(driver);
	     action1.click(Assignment)	
	           .pause(Duration.ofSeconds(2))
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
               .keyDown(Keys.ENTER)
               .build()
               .perform();
	     
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
         Thread.sleep(3000);
      
         //assessment
	     WebElement Assessment  =  driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div"));
	     Actions action2 =  new Actions(driver);
	     action2.click(Assessment)
               .pause(Duration.ofSeconds(2))
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
               .keyDown(Keys.ENTER)
               .build()
               .perform();
	     
	     js.executeScript("window.scrollBy(0,document.body.Bottom)");
         Thread.sleep(3000); 
         
         //InterView
	     WebElement interview  =  driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/div/div"));
	     Actions action3 =  new Actions(driver);
	     action3.click(interview)
               .pause(Duration.ofSeconds(2))
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
	           .keyDown(Keys.ARROW_DOWN)
               .keyDown(Keys.ENTER)
               .build()
               .perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='accordion-body']/div/a[2]")).click();
	    
		  String mainwin = driver.getWindowHandle();
		  Set<String> allwin = driver.getWindowHandles();
		   for (String win : allwin) {
			   if (!win.equals(mainwin)) {
				   driver.switchTo().window(win);
				   Thread.sleep(2000);
			   }
	}
	}
	//resume
	public void resume () throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[4]")).click();
		
	 // personal detail
      WebElement title =  driver.findElement(By.id("title"));
      title.clear();
	  title.sendKeys("Manual & Automation tetsing");      
      
	  WebElement contact =  driver.findElement(By.id("contact"));
	  contact.clear();
	  contact.sendKeys("8849421545");      
	      
	      
  	  WebElement email =  driver.findElement(By.id("email"));
  	  email.clear();
	  email.sendKeys("aniketpatil7733@gmail.com");      
      driver.findElement(By.id("dob")).sendKeys("01-01-2004");
	     
	  WebElement addresh =   driver.findElement(By.id("address"));
	  addresh.clear();
	  addresh.sendKeys("amraiwadi ahmedabad ,360026");
    
	      
	 	driver.findElement(By.id("linkedinLink")).sendKeys("https://www.linkedin.com/in/patil-aniket-03841b2a3?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app");
	    driver.findElement(By.id("githubLink")).sendKeys("https://github.com//");
	    driver.findElement(By.id("personalDetailSubmit")).click();
	    
	//profile summary
	    
	   driver.findElement(By.id("v-pills-profile-tab")).click();
	   Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,document.body.top)");
	   
	   WebElement summary = driver.findElement(By.id("summeryContent"));
	   summary.clear();
	   summary.sendKeys(" i am aniket");
	   Thread.sleep(2000);
  	   driver.findElement(By.id("personalDetailSubmit")).click();
	   
   // technical skill
  	   
  	   driver.findElement(By.id("v-pills-technical-tab")).click();
	   js.executeScript("window.scrollBy(0,document.body.top)");

  	   driver.findElement(By.id("programmingLanguages")).sendKeys("java");
  	   driver.findElement(By.id("databases")).sendKeys("My SQL");
  	   driver.findElement(By.id("webServers")).sendKeys("webServers");
	   js.executeScript("window.scrollBy(0,document.body.bottom)");

  	   driver.findElement(By.id("softwares")).sendKeys("jira");
  	   driver.findElement(By.id("systems")).sendKeys("windows");
  	   driver.findElement(By.xpath("//div[@id='v-pills-technical']/form/div[6]/div/input")).click();
  	   
   // EXpireance 
  	   driver.findElement(By.id("v-pills-projects-tab")).click();
  	   Thread.sleep(2000);
  	   driver.findElement(By.linkText("+ Add Experience Details")).click();
  	   Thread.sleep(2000);
  	   driver.findElement(By.id("companyName")).sendKeys("ani information pvt.ltd.");
  	   driver.findElement(By.id("position")).sendKeys("Soft.Engg.");
  	   driver.findElement(By.id("jobDescriptionText")).sendKeys("ahmedabad"); 
  	   driver.findElement(By.id("jobTenureFrom")).sendKeys("01/01/2024");
  	   driver.findElement(By.id("jobTenureTo")).sendKeys("01/01/2025");
  
  	   driver.findElement(By.id("companyDetailsFormSubmit")).click();
  	   Thread.sleep(2000);
  	   driver.findElement(By.xpath("//div[@id='v-pills-projects']/div/div[1]/div[1]/div[2]/a[2]")).click();
  	   Thread.sleep(2000);
  	   driver.switchTo().alert().accept();
  	   
  	   js.executeScript("window.scrollBy(0,document.body.bottom)");
  	   Thread.sleep(2000);

  	   driver.findElement(By.xpath("//div[@id='v-pills-projects']/div/div[3]/div/input")).click();
//	
   // education
  	    
      driver.findElement(By.id("v-pills-education-tab")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("+ Add Education Details")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("degree")).sendKeys("10thpass");
	  driver.findElement(By.id("collegeName")).sendKeys("LJ poley");
	  driver.findElement(By.id("passingYear")).sendKeys("2019");
	  driver.findElement(By.id("result")).sendKeys("70");
	  driver.findElement(By.id("eduResultUnit")).click();
	  driver.findElement(By.xpath("//div[@id='mobileAddBtnSection-courseEdu']/div/input")).click();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,document.body.bottom)");	  

      driver.findElement(By.xpath("//div[@id='v-pills-education']/div/div[4]/div[2]/div/a[2]/i")).click();
       
	  driver.findElement(By.linkText("Save & Preview")).click();
      
	  String mainwin = driver.getWindowHandle();
	  Set<String> allwin = driver.getWindowHandles();
	   for (String win : allwin) {
		   if (!win.equals(mainwin)) {
			   driver.switchTo().window(win);
			   Thread.sleep(2000);

      driver.findElement(By.linkText("Download Resume")).click();
	 		   
  }
  }
	   driver.close();
	   driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}
	
	//job tracker
	public void job_tracker() {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[5]")).click();
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
	}
	 
	//upload review 
	public void upload_review () {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[6]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/a/img")).click();
	    driver.findElement(By.className("mfp-close")).click();
	    driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();
	}
	
	//rewards
	public void rewrda() {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[7]")).click();
	    driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}
	
	//refer
	public void refer_friends () {
		driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[8]")).click();
        driver.findElement(By.id("referFirstName")).sendKeys("patil");
        driver.findElement(By.id("referLastName")).sendKeys("aniket");
        driver.findElement(By.id("referMobile")).sendKeys("8849421545");
        driver.findElement(By.id("referCollegeName")).sendKeys("LJ");
        driver.findElement(By.id("referEducation")).sendKeys("diploma");
        driver.findElement(By.id("referFriendSubmit")).click();
	    driver.findElement(By.xpath("//div[@class='inner-wrapper']/div/div/div/div/ul/li[1]")).click();

	}   
	
	
}
