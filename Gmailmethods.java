package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmailmethods
{
	WebDriver driver;
	@Given ("^navigate to gamil$")
	public void method1()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
	}
	@When("^enter userid as \"(.*)\" and click next$")
	public void method2(String uid)throws Exception
	{
		driver.findElement(By.name("Email")).sendKeys(uid);
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
	}
	@Then ("^password will be displayed$")
	public void method3()
	{
		try
		{
			if(driver.findElement(By.name("Passwd")).isDisplayed())
			{
				System.out.println("Test Passed");
			}
		}
		catch(Exception e)
		{
			System.out.println("Test Failed");
		}
	}
	@And("^close site$")
	public void method4()
	{
		driver.close();
	}
	@Then("^error msg will be displayed$")
	public void method5()
	{
		try
		{
			if(driver.findElement(By.id("errormsg_0_Email")).isDisplayed())
			{
				System.out.println("Test Passed");
			}
		}
		catch(Exception e)
		{
			System.out.println("Test failed");
		}
	}

}
