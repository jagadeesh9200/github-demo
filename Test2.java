package job;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:\\www.google.co.in");
		
		Thread.sleep(5000);
		
		driver.close();
	
		

	}

}
