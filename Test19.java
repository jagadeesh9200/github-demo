package job;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Test19 
{

	
	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		//Launch millionsclouds.com site
		
		System.setProperty("webdriver.gecko.driver","F:\\Batch230\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(10000);
		 driver.get("https://www.millionclouds.com");
		 //driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 //prepare registration (sikulix)
		 
		 Screen s=new Screen();
		 if(s.exists("registration.png")!=null)
		 {
			 s.click("registration.png");
			 Thread.sleep(5000);
		 }
		 else
		 {
			 System.exit(0);//stop execution

		 }
		 
		 s.type("email.png","kodelajagadeesh@gmail.com");
		 Thread.sleep(5000);
		 s.type("retypeemail.png","kodelajagadeesh@gmail.com");
		 Thread.sleep(5000);
		 s.type("password.png","kodela123");
		 Thread.sleep(5000);
		 s.type("retypepassword.png","kodela123");
		 Thread.sleep(5000);
		 s.click("signup.png");
		 Thread.sleep(5000);
		 s.wheel(Button.WHEEL_DOWN, 5);
		 Thread.sleep(5000);
		 s.click("ok.png");
		 
		 //close site(SWD)
		 
		 driver.quit();
		 
	}

}
