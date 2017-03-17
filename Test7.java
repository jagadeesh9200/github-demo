package job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Kodela");
		driver.findElement(By.name("lastName")).sendKeys("jagadeesh");
		driver.findElement(By.name("phone")).sendKeys("9492134352");
		driver.findElement(By.name("userName")).sendKeys("jagadeeshking1@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Pandaripuram,2nd line");
		driver.findElement(By.name("address2")).sendKeys("Lakshmipuram");
		driver.findElement(By.name("city")).sendKeys("Guntur");
		driver.findElement(By.name("state")).sendKeys("AndhraPradesh");
		driver.findElement(By.name("postalCode")).sendKeys("522 007");
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("kodela");
		driver.findElement(By.name("password")).sendKeys("kodela8600");
		driver.findElement(By.name("confirmPassword")).sendKeys("kodela8600");
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		driver.close();
		
				

	}

}
