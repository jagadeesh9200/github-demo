 package job;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test31
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//????????????????????   HOT MAIL TESTING      ?????????????????????????????
		
		// Launch site
		System.setProperty("webdriver.chrome.driver","F:\\batch230\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotmail.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//enter login-id and pwd
		WebElement e=driver.findElement(By.xpath("//*[starts-with(text(),'Email')]"));
		Actions a=new Actions(driver);
		a.sendKeys(e,"kodelajagadeesh@gmail.com").build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@value='Next']")).click();
		Thread.sleep(4000);
		WebElement f=driver.findElement(By.name("passwd"));
		a.sendKeys(f,"kodela8600").build().perform();
		Thread.sleep(4000);
		//click signin
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();
		Thread.sleep(4000);
		//click new 
		driver.findElement(By.xpath("//*[starts-with(@title,'Write')]")).click();
		Thread.sleep(4000);
		//send mail 
		driver.findElement(By.xpath(("(//*[@autoid='_fp_5'])[1]"))).sendKeys("jagadeeshking1@gmail.com",Keys.TAB,"hotmail automation");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@aria-label='Message body']")).sendKeys("hi.....",Keys.ENTER,"hot mail automation successful");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(.//*[@title='Send'])[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[@aria-haspopup='true'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.quit();

	}

}
