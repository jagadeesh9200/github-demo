package driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail 
{
	WebDriver driver;
	public String launch(String o,String d,String c) throws Exception
	{
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(d);
		Thread.sleep(5000);
		return("done");
	}
	public String fill(String o,String d,String c)throws Exception
	{
		driver.findElement(By.xpath(o)).sendKeys(d);
		Thread.sleep(4000);
		return("done");
	}
	public String click(String o,String d,String c)throws Exception
	{
		driver.findElement(By.xpath(o)).click();
		Thread.sleep(5000);
		return("done");
	}
	public String validate_userid(String o,String d,String c)throws Exception
	{
		if(c.equalsIgnoreCase("valid")&&driver.findElement(By.name("Passwd")).isDisplayed())
		{
			return("Test Passed");
		}
		else if(c.equalsIgnoreCase("invalid")&&driver.findElement(By.id("errormsg_0_Email")).isDisplayed())
		{
			return("Test Passed");
		}
		else
		{
			return("Test Failed");
		}
	}
	public String close(String o,String d,String c)throws Exception
	{
		driver.close();
		Thread.sleep(5000);
		return("done");
	}
}
