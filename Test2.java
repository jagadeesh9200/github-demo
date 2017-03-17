package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 
{
	public WebDriver driver;
  @Test
  public void f()throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.yahoo.com");
	  Thread.sleep(2000);
	  driver.close();
  }
}
