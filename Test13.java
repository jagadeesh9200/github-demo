package job;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test13 
{

	public static void main(String[] args) throws InterruptedException
	
	{
	
	//GMAILE REGISTRATION //
		
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.gmail.com");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
	 //click create account link
		 driver.findElement(By.partialLinkText("Create account")).click();
		 Thread.sleep(1000);
	 //fill fields
		 driver.findElement(By.name("FirstName")).sendKeys("batch230");
		 driver.findElement(By.name("LastName")).sendKeys("SDET");
		 driver.findElement(By.name("GmailAddress")).sendKeys("batch230sdet");
		 driver.findElement(By.name("Passwd")).sendKeys("deepsleep");
		 driver.findElement(By.name("PasswdAgain")).sendKeys("deepsleep");
	 //select month developing using div tag.
		 WebElement e=driver.findElement(By.xpath("(//*[@aria-expanded='false'])[1]"));
		 Actions a=new Actions(driver);
		 a.click(e).build().perform();
		 Thread.sleep(5000);
		 a.sendKeys("AUG").build().perform();
		 Thread.sleep(5000);
		 a.sendKeys(Keys.ENTER).build().perform();
	 //fill remaing fels
		 driver.findElement(By.name("BirthDay")).sendKeys("15");
		 driver.findElement(By.name("BirthYear")).sendKeys("1947");
	 //select gender developed using div tag
		 WebElement e1=driver.findElement(By.xpath("//*[@title='Gender']"));
		 a.click(e1).build().perform();
		 Thread.sleep(5000);
		 a.sendKeys("m").build().perform();
		 a.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(5000);
		 a.sendKeys("Keys.ENTER").build().perform();
	 
	//select country developed using div tag
		 WebElement e2=driver.findElement(By.xpath(".//*[@title='Mobile phone']"));
		 a.click(e2).build().perform();
		 Thread.sleep(5000);		 
		 a.sendKeys("India").build().perform();
		 Thread.sleep(5000);
		 /*a.sendKeys("Keys.DOWN").build().perform();
		 Thread.sleep(5000);
		 a.sendKeys(Keys.ENTER).build().perform();*/
		 
	 //Fill further fields
		 driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("9492134352");
		 driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("jagadeeshking1@gmail.com");
		 driver.findElement(By.name("submitbutton")).click();
		 Thread.sleep(5000);
	 //scroll terms element and click "i agree"
		 for(int i=1;i<17;i++)
		 {
			 a.sendKeys(Keys.DOWN).build().perform();
			 Thread.sleep(1000);
			 			 
		 }
			 Thread.sleep(3000);
			 driver.findElement(By.name("iagreebutton")).click();
			 Thread.sleep(5000);	
	//verification process
			 
			driver.findElement(By.id("next-button")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("smsUserPin")).sendKeys("470701");
			driver.findElement(By.name("VerifyPhone")).click();
	
			
	//close site
			 driver.close();
		 
			 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
