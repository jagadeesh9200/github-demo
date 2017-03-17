package job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Test18 
{

	
	public static void main(String[] args) throws InterruptedException, FindFailed
	{
		//YOUTUBE AUTOMATION WITH SELENIUM AND SIKULI
		System.setProperty("webdriver.chrome.driver","F:\\Batch230\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.youtube.com");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.findElement(By.name("search_query")).sendKeys("nenu local trailer");
		 driver.findElement(By.id("search-btn")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.partialLinkText("Nenu Local Theatrical Trailer")).click();
		 Thread.sleep(5000);
		 Screen s=new Screen();
		 Location l=new Location(100,200);
		 Thread.sleep(10000);
		 s.wheel(l, Button.LEFT,0);
		 s.click("F:\\Batch230\\Automation\\kalam\\pause.png");
		 Thread.sleep(10000);
		 s.click("F:\\Batch230\\Automation\\kalam\\play.png");
		 Thread.sleep(10000);
		 s.mouseMove("F:\\Batch230\\Automation\\kalam\\volume.png");
		 Thread.sleep(5000);
		 Match e=s.find("F:\\Batch230\\Automation\\kalam\\bar.png");
		Thread.sleep(5000);
		Location el1=new Location(e.getX()-20,e.getY());
		s.dragDrop(e,el1);
		Thread.sleep(5000);
		Location el2=new Location(el1.getX()+20,e.getY());
		s.dragDrop(e,el2);
		Thread.sleep(5000);
		driver.close();
		
		
		 
		
	}

}
