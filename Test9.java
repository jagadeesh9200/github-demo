package job;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.facebook.com");
		Thread.sleep(5000);
		String x=driver.getCurrentUrl();
		if(x.contains("http"))
		{
		System.out.println("Secured site");
		}
		else
		{
			System.out.println("Not Securable");
		}
		driver.close();
	}
}
