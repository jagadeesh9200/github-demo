package job;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 
{

	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://site24.way2sms.com/content/index.html?");
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//img[@src='../images/android-button.png']")).click();
	 Thread.sleep(5000);
	 ArrayList<String> l=new ArrayList<String>(driver.getWindowHandles());
	 driver.switchTo().window(l.get(1));
	 driver.close();
	 Thread.sleep(5000);
	 driver.switchTo().window(l.get(0));
	 driver.findElement(By.name("username")).sendKeys("9492134352");
	 driver.findElement(By.name("password")).sendKeys("kodela");
	 driver.findElement(By.id("loginBTN")).click();
	 Thread.sleep(5000);
	 
	 driver.close();
	}

}
