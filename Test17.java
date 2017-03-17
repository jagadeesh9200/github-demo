package job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 
{

	public static void main(String[] args) throws InterruptedException 
	{
	//Launch Gmail site
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.gmail.com");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
	//Do login
		 driver.findElement(By.name("Email")).sendKeys("jagadeeshking1");
		 driver.findElement(By.id("next")).click();
		 Thread.sleep(5000);
		 
		 
	}

}
