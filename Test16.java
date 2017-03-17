package job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.gmail.com");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.findElement(By.name("Email")).sendKeys("jagadeeshking1");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@value='Next']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.name("Passwd")).sendKeys("kodela8600");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		 
		 

	}

}
