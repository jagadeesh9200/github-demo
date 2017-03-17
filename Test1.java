package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 
{
	public WebDriver driver;
  @Test(priority=0)
  public void launch() throws Exception
  {
	  //Launch site
	  System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.gmail.com");
	  Thread.sleep(5000);
  }
  @Test(priority=1)
  public void close() throws Exception
  {
	  //Close site
	  driver.close();
  }
  
}
