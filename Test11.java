package job;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 
{
	public static void main(String[] args) throws InterruptedException 
	{
	//Delete all existing cookies
		 System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
	//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
	//check loaded cookies
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("Cookies Were Loaded");
			
		}
		else
		{
			System.out.println("Cookies Were Not Loaded");
		}
		
	//close site
		driver.close();
	}

}
