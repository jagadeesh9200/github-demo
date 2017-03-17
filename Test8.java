package job;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.co.in");
		Thread.sleep(5000);
		String x=driver.getTitle();
		System.out.println(x);
		Thread.sleep(5000);
		driver.close();

	}

}
