package job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test32 
{

	public static void main(String[] args) throws Exception
	{
		//way2sms Registration Process 
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://site24.way2sms.com/content/index.html?");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 //click Register Here
		 driver.findElement(By.xpath("//*[@value='Register Here']")).click();
		 //click radio button
		 driver.findElement(By.id("male")).click();
		 //fill the registration form all field
		 driver.findElement(By.name("name")).sendKeys("Jagadeesh kodela");
		 driver.findElement(By.name("dob")).sendKeys("17/10/1992");
		 driver.findElement(By.name("email")).sendKeys("jagadeeshking1@gmail.com");
		 driver.findElement(By.name("cemail")).sendKeys("jagadeeshking1@gmail.com");
		 driver.findElement(By.id("city")).sendKeys("Guntur");
		 driver.findElement(By.name("mno1")).sendKeys("9063942555");
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//*[@id='capImg']")).click();
		 Thread.sleep(7000);
		 driver.findElement(By.id("terms")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@value='Verify & Register']")).click();
		 
		 
		 
		 
		 
		 
	}

}
