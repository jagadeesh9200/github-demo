package job;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Test26
{

	public static void main(String[] args) throws InterruptedException 
	{
	//take data from keyboard
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a mobile number");
	String m=sc.nextLine();
	System.out.println("Enter a mobile number criteria");
	String mc=sc.nextLine();
	System.out.println("Enter a password");
	String p=sc.nextLine();
	System.out.println("Enter a password criteria");
	String pc=sc.nextLine();
	//Launch site
	System.setProperty("webdriver.chrome.driver", "F:\\batch230\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://site24.way2sms.com/content/index.html?");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//do login
	driver.findElement(By.name("username")).sendKeys(m);
	driver.findElement(By.name("password")).sendKeys(p);
	driver.findElement(By.id("loginBTN")).click();
	Thread.sleep(5000);
	//checking login operation
	if(m.length()<10 && ExpectedConditions.alertIsPresent()!=null)
	{
		System.out.println("Test Passed");
		driver.switchTo().alert().dismiss();
	}
	else if(mc.equals("invalid")&&driver.findElement(By.xpath
			("//*[contains(text(),'rigistered yet')]")).isDisplayed())
	{
		System.out.println("Test Passed");
	}
	else if(mc.equals("valid")&&pc.equals("invalid")&&driver.findElement(By.xpath
			("//*[contains(text(),'Forgot Password')]")).isDisplayed())		
	{
		System.out.println("Test Passed");
	}
	else if(mc.equals("valid")&&pc.equals("valid")&&driver.findElement(By.xpath
			("//*[@value='Skip'or@value='Send Free SMS']")).isDisplayed())
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");
	}
	//close site
		driver.quit();
	}

}
