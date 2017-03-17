package job;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//take data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a userid");
		String u=sc.nextLine();
		System.out.println("Enter a userid criteria");
		String uc=sc.nextLine();
		String p=null;
		String pc=null;
		if(uc.equals("valid"))
		{
			System.out.println("Enter a password");
			p=sc.nextLine();
			System.out.println("Enter a password criteria");
			pc=sc.nextLine();
		}
		//Launch site
		System.setProperty("webdriver.chrome.driver", "F:\\batch230\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get
		("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//user id testing
		driver.findElement(By.name("Email")).sendKeys(u);
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		if(uc.equals("valid")&&driver.findElement(By.name("Passwd")).isDisplayed())
		{
			System.out.println("userid test passed");
			driver.findElement(By.name("Passwd")).sendKeys(p);
			driver.findElement(By.id("signIn")).click();
			Thread.sleep(5000);
			if(pc.equals("valid")&& driver.findElement(By.xpath("//*[text()='COMPOSE']")).isDisplayed())
			{
				System.out.println("Password test passed");
			}
			else if(pc.equals("invalid")&&driver.findElement(By.id("errormsg_0_Passwd")).isDisplayed())
			{
				System.out.println("Password test passed");
			}
			else
			{
				System.out.println("Password test failed");
			}
		}
		else if(uc.equals("invalid")&&driver.findElement(By.id("errormsg_0_Email")).isDisplayed())
		{
			System.out.println("userid test passed");
		}
		else
		{
			System.out.println("userid test failed");
		}
		//close site
		driver.close();
	}
}
