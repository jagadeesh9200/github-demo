package job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.findElement(By.name("firstname")).sendKeys("batch");
		 driver.findElement(By.name("lastname")).sendKeys("SDET");
		 Thread.sleep(4000);
		 driver.findElement(By.name("reg_email__")).sendKeys("chinni@gmail.com");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[starts-with(@aria-label,'Re-enter')]")).sendKeys("chinni@gmail.com");
		 Thread.sleep(4000);
		 driver.findElement(By.name("reg_passwd__")).sendKeys("sleepres");
		 Select s=new Select(driver.findElement(By.name("birthday_day")));
		 s.selectByVisibleText("28");
		 Thread.sleep(4000);
		 Select s1=new Select(driver.findElement(By.id("month")));
		 s1.selectByIndex(1);
		 Thread.sleep(4000);
		 Select s2=new Select(driver.findElement(By.id("year")));
		 s2.selectByVisibleText("1992");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(.//*[@type='radio'])[2]")).click();
		 driver.findElement(By.name("websubmit")).click();
		 Thread.sleep(10000);
		 driver.close();
		 //login
		 System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		 WebDriver driver1=new ChromeDriver();
		 driver1.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver1.findElement(By.id("email")).sendKeys("8341468813");
		 Thread.sleep(4000);
		 driver1.findElement(By.id("pass")).sendKeys("8341468813");
		 Thread.sleep(3000);
		 driver1.findElement(By.id("loginbutton")).click();
		 Thread.sleep(5000);
		 //driver1.switchTo().alert().dismiss();
		 driver1.findElement(By.name("mercurymessages")).click();
		 Thread.sleep(3000);
		 driver1.findElement(By.linkText("New Message")).click();
		 Thread.sleep(3000);
		 
		 
		
	}

}
