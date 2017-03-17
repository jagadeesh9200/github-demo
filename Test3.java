package job;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 
{


	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.gecko.driver","F:\\Batch230\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}

}
